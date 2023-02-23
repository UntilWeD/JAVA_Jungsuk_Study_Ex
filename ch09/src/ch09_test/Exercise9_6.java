package ch09_test;

public class Exercise9_6 {
	public static String fillZero(String src, int length) {
		String result ="";
			if(src == null || src.length() == length)
				return src;
			else if (length <= 0) {
				return "";
			}
			
			if(src.length() > length)
				return src.substring(0,length);
			
			char[] arr = new char[length];
			
			for(int i=0; i < length;i++) 
				arr[i] = '0';
			
			for(int i=0; i<src.length();i++) 
				arr[length-src.length()+i]= src.charAt(i);
			
			for(int i=0;i<arr.length;i++)
				result +=arr[i];

			return result;
		}


	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}
