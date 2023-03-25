package ch15_test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Exercise15_1 {
	public static void main(String[] args) {
		String fileName = "test.txt";
		int lineNum = 10;
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			for(int i = 1; i< lineNum+1; i++) {
				line = br.readLine();
				System.out.println(i+ ":" +line);
			}
			
			// 읽어올 량 정하는 것
			//읽어온 라인마다 특정 문자열 출력
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("error occured : " + e);
			System.exit(0);
		}

	}
}
