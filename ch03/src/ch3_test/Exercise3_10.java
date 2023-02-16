package ch3_test;

public class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (64 < ch && ch < 97) ? (char)(ch+32): ch;
		
		System.out.println("ch="+ch);
		System.out.println("ch to lowerCase="+lowerCase);
	}

}
