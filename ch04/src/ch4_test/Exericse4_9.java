package ch4_test;

public class Exericse4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0;i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			sum += num;
		}
		
		System.out.println("sum="+sum);
	}

}
