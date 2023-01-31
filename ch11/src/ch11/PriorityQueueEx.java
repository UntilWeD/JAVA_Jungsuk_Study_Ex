package ch11;

import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue<>();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq); //pq의 내부배열을 출력
		
		Object obj = null;
		
		while((obj = pq.poll()) != null)
			System.out.println(obj);
	}

}
