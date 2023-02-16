package ch3_test;

public class Exercise3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ((int)((5f/9)*(fahrenheit-32f+0.005)*100))/100.0f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
