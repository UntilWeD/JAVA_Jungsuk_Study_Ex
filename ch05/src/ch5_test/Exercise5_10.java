package ch5_test;

public class Exercise5_10 {
	public static void main(String[] args) {
		char[] abcCode =
		{ '`','~','!','@','#','$','%','^','&','*',
		'(',')','-','_','+','=','|','[',']','{',
		'}',';',':',',','.','/'};
		
							// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if(47 < ch && ch <58) {
				result += numCode[ch-'0'];
			} else {
				result += abcCode[ch-97];
			}

		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}
