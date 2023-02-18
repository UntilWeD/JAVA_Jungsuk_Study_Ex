package ch4_test;

public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		
		
		while(sum <= 100) {
			++i;
			if(i%2!=0)
				sum += i;
			else
				sum -= i;
		}
		
		System.out.printf("%d째 더해야 100이상이다. 나온값은 %d이다.", i, sum);
	}

}
