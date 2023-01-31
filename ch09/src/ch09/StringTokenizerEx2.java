package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true); //전체구분자가 아니라 하나하나가 구분자이다.
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
