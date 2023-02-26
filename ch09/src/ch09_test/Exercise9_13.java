package ch09_test;

public class Exercise9_13 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa " + stringCount(src, "aa") +"개 찾았습니다."); 
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length() == 0)
			return 0;
		
		while( src.indexOf(key, index) != -1 ) {
			count++;
			index = src.indexOf(key, index) + key.length();
			System.out.println(src.indexOf(key, index));
		}
		
		return count;
		}
}
