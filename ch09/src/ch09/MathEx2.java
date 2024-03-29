package ch09;

import static java.lang.System.*;
import static java.lang.Math.*;

public class MathEx2 {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		System.out.println(" i= "+  i);
		System.out.println("-i= "+ -i);
		
		try {
			out.printf("negateExact(%d)= %d%n",  10, negateExact(10));
			out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));
			out.printf("negateExact(%d)= %d%n",  i, negateExact(i)); //예외발생
		} catch (ArithmeticException e) {
			out.printf("negateExact(%d)= %d%n",  (long)i, negateExact((long)i));
			// TODO: handle exception
		}
	}

}
