package ch11;

import java.util.*;
import java.io.*;
import static java.util.Collections.*;

public class CollectionEx {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2); // 오른쪽으로 두칸씩이동
		System.out.println(list);
		
		swap(list, 0, 2); // 첫번째와 세번째 교환
		System.out.println(list);
		
		shuffle(list); // 저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder());
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int idx = binarySearch(list, 3); // 3이 저장된 위치 반환
		System.out.println("index of 3 =" +idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder()));
		
		fill(list, 9); //list를 9로 채운다.
		System.out.println("list="+list);
		
		//list와 같은 크기의 새로운 리스트를 생성하고 2로 채운다. 결과는 변경불가
		List newList = nCopies(list.size(), 2);
		System.out.println("newList="+newList);
		
		System.out.println(disjoint(list, newList));
		
		copy(list, newList);
		System.out.println("newList="+newList);
		System.out.println("list="+list);
		
		replaceAll(list, 2, 1);
		System.out.println("list="+list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2="+list2);
		
	}

}