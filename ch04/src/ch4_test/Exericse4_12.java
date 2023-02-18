package ch4_test;

public class Exericse4_12 {
	public static void main(String[] args) {
		for(int i = 2; i <10; i=i+3){
			for(int j=1; j<4;j++){
				for(int k=0;k<3;k++) {
					if(i+k>=10) 
						continue;
					System.out.printf("%d*%d=%d \t", i+k, j, (i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}
