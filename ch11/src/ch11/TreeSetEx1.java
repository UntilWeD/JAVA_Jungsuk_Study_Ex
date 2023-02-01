package ch11;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new  TreeSet();
		
		String from = "b";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("zzz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("elevator");
		set.add("dZZZ");
		
		System.out.println(set);
		System.out.println("range search: from " + from +" to "+ to);
		System.out.println("result1 : " +set.subSet(from, to));
		System.out.println("result2 : " +set.subSet(from, to + "zzz"));
	}

}
