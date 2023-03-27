package ch15_test;

import java.io.*;

public class Exercise15_5 {

	public static void main(String[] args) {
		

		
		String inputFile = "tag.txt";
		String outputFile = "result15_5.txt";
		try {
			BufferedReader input= 
					new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output = 
					new HtmlTagFilterWriter(new FileWriter(outputFile));
			int ch = 0;
			
			while((ch=input.read())!=-1) {
				output.write(ch);
			}
			
			input.close();
			output.close();
		} catch(IOException e) { }
		

		
		
	}
}

class HtmlTagFilterWriter extends FilterWriter {
	StringWriter tmp = new StringWriter();
	boolean inTag = false;
	
	HtmlTagFilterWriter(Writer out) {
		super(out);
	}
	
	public void write(int c) throws IOException {
		if( c == '<') {
			inTag = true;
		} else if(c == '>') {
			inTag = false;
			tmp.close();
		} else if (inTag) {
			tmp.append((char)c);
		} else if (!inTag) {
			out.write((char)c);
		} 
		
		
	}
	
	public void close() throws IOException {
		out.write(tmp.toString()); // StringWriter의 내용을 출력하고
		super.close(); // close() . 조상의 close()를 호출해서 기반 스트림을 닫는다
	}
}
















