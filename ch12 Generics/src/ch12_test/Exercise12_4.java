package ch12_test;

import java.util.*;

public class Exercise12_4 {
	public static void main(String[] args) {
		ArrayList<Product> arr = new ArrayList<Product>(3);
		ArrayList<Product> arr2 = new ArrayList<Product>(4);
		
		ArrayList<Product> arr3 = merge(arr, arr2);
	
		System.out.println(arr3.size());
	}
	
	public static <T extends Product> ArrayList merge(
		ArrayList<T> list1, ArrayList<T> list2) {
			ArrayList<T> newList = new ArrayList<>(list1);
			
			newList.addAll(list2);
			
			return newList;
			
		}

}

class Product{
	
}