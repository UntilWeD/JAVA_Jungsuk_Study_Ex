package ch4_test;

public class Exercise4_5 {
	public static void main(String[] args) {
		int i=0, j=0;
		while(i <= 10) {
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			j=0;
			i++;
			System.out.println();
		}
	}

}
