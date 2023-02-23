package ch09_test;

public class Exercise9_3 {
	public static void main(String[] args) {
		
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		
		fileName = fullPath.substring(fullPath.lastIndexOf("\\")+1);
		path = fullPath.substring(0, fullPath.lastIndexOf(fileName)-1);

		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);

	}

}
