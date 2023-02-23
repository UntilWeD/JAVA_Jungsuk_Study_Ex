package ch09_test;

public class Exercise9_7 {
	static boolean contains(String src, String target) {
		return src.contains(target) ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	}

}
