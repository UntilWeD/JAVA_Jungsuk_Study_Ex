package ch15_test;

import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Exercise15_6 {
	
	static String[] argArr; // 입력한 매개변수를 담기위한 문자열배열
	static File curDir; // 현재 디렉토리
	
	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch(Exception e) { }
	}


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try {
				String prompt = curDir.getCanonicalPath() + ">>";
				System.out.print(prompt);
				
				// . 화면으로부터 라인단위로 입력받는다
				String input = s.nextLine();
				
				input = input.trim(); // . 입력받은 값에서 불필요한 앞뒤 공백을 제거한다
				argArr = input.split(" +");
				
				String command = argArr[0].trim();
				
				if("".equals(command)) continue;
				
				command = command.toLowerCase(); // . 명령어를 소문자로 바꾼다
				
				if(command.equals("q")) { // q Q . 또는 를 입력하면 실행종료한다
					System.exit(0);
				} else if(command.equals("cd")) {
					cd();
				} else {
					for(int i=0; i < argArr.length;i++) {
						System.out.println(argArr[i]);
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("입력오류입니다."); 
			}
		} // while(true)
	} // main
	
	public static void cd() {
		if(argArr.length==1) {
			System.out.println(curDir);
			return;
		} else if(argArr.length > 2) {
			System.out.println("USAGE : cd directory");
			return;
		}
	
		String subDir = argArr[1];
		
		System.out.println("direcotry: " + subDir);
			
		// 시작 
		if(subDir.equals("..")) {

			File tempFile = new File(curDir.getParent());
			curDir = tempFile;
		} else if(subDir.equals(".")) {
			System.out.println("현재경로입니다: " +curDir.getAbsolutePath());
			System.out.println("현재 디렉터리내에 있는 파일: " + Arrays.asList(curDir.listFiles()));
			
		} else {
			List<String> list = Arrays.asList(curDir.list());
			
			for(String str : list) {
				if(subDir.equals(str)) {
					String tempPath = curDir.getPath() + "\\" +subDir;
					File tempFile = new File(tempPath);
					curDir = tempFile;
					return;
				}
			}
			System.out.println("유효하지 않은 디렉토리입니다.");
			return;
		}
		// 끝
		
	} // cd()
}

