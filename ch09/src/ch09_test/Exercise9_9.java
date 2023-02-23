package ch09_test;

public class Exercise9_9 {
	static String delChar(String src, String delCh) {
		StringBuffer src1 = new StringBuffer(src);
		
		for(int i=0; i < src1.length(); i++) 
			if(delCh.contains(src1.charAt(i)+"")) {
				src1.setCharAt(i,' ');
			}

		return (src1.toString()).replace(" ", "");
		
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "+ delChar("(1 2 3 4\t5)"," \t"));
	}

}
