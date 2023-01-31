package ch10;

import java.text.*;

public class ChoiceFormatEx2 {

	public static void main(String[] args) {
		String pattern = "60#D|70#C|80<B|90#A";
		int[] score = {91, 90, 88, 80, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i=0;i<score.length; i++) {
			System.out.println(score[i]+":"+form.format(score[i]));
		}
	}

}
