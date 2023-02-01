package ch11;

import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //String의 comparable의 구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자구분안함 
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}

}

class Descending implements Comparator{
	public int  compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본정렬방식을 -1로 바꾼다. 이는 c2.compareTo(c1)과 같다.
		}
		return -1;
	}
}
