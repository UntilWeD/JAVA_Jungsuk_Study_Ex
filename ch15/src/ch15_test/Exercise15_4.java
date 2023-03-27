package ch15_test;

import java.io.*;

public class Exercise15_4 {

	public static void main(String[] args) {
		
		String[] strArr = {"123.txt", "test.txt"};
		File f1 = new File("C:\\Users\\Jhin\\git\\JAVA_Jungsuk_Study_Ex\\ch15\\src\\ch15_test","result.txt");
		
		try {
			f1.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(f1);
			
			for(String f : strArr) {
				FileInputStream fis = new FileInputStream(f);
				while(fis.available()!= 0) {
					fos.write((char)fis.read());
				}
				fis.close();
			}
			
		} catch (Exception e) {
			System.out.println("에러발생 :" + e);
		}
		
	}
}
