package ch09_test;

import java.util.Arrays;

public class Exercise9_10 {
	static String format(String str, int length, int alignment) {
		if(length < str.length())
			return str.substring(length);
		
		if(alignment != 0) {
			char[] arr1 = new char[length];
			char[] arr2 = new char[str.length()];
			
			for(int i=0; i<arr2.length;i++)
				arr2[i] = str.charAt(i);
			
			for(int i=0;i<length;i++)
				arr1[i] = ' ';
			
			if (alignment == 2) {
				System.arraycopy(arr2, 0, arr1, length-str.length(), str.length());
				return new String(arr1);
			} else if (alignment == 1) {
				System.arraycopy(arr2, 0, arr1, (length/2)-(int)(Math.ceil((str.length()/(double)length))), str.length());
				Arrays.sort(arr1, 0, 1);
				return new String(arr1);
			} 
		} 
		
		return str;
		
	}

	public static void main(String[] args) {
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬

	}
}
