package ch15_test;

import java.io.*;

public class Exercise15_3 {
	static int totalFiles = 0;
	static int totalDirs = 0;
	static int totalSize = 0;

	public static void main(String[] args) {

	
		File dir = new File("C:\\Users\\Jhin\\git\\JAVA_Jungsuk_Study_Ex\\ch15");
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다."); 
			System.exit(0);
		}
		
		countFiles(dir);
		
		System.out.println();
		System.out.println("총 " + totalFiles + " 개의 파일"); 
		System.out.println("총 " + totalDirs + " 개의 디렉토리");  
		System.out.println("크기 " + totalSize + " bytes"); 
	}
	
	public static void countFiles(File dir) {
			File[] files = dir.listFiles();
			
			for(File f : files) {
				if(f.isDirectory()) {
					totalDirs++;
					countFiles(f);
				} else {
					totalFiles++;
					totalSize += (int)f.length();
				}
				
			}
	} // countFiles

}
