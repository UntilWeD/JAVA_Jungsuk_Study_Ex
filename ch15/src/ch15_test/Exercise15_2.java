package ch15_test;

import java.io.FileInputStream;
import java.io.PrintStream;

public class Exercise15_2 {

	public static void main(String[] args) {
		String Filename = "test.txt";
		
		try {
			FileInputStream fis = new FileInputStream(Filename);
			
			while(fis.read() != -1) {
				System.out.printf("%2x ", fis.read());
				
			}
		} catch (Exception e) {
			System.out.println("error occured : " + e);
			System.exit(0);
		}
	}

}
