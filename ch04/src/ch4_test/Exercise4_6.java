package ch4_test;

public class Exercise4_6 {
	public static void main(String[] args) {
		for(int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(i + j == 6)
					System.out.printf("눈의 합이 6이 되는 경우 %d+%d=%d %n", i, j, i + j);
			}
		}
	}

}
