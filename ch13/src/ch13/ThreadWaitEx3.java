package ch13;

import java.util.ArrayList;

public class ThreadWaitEx3 {
	public static void main(String[] args) throws Exception{
		Table table = new Table(); //여러쓰레드가 공유하는 객체
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut" ), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);

	}

}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {Thread.sleep(100);} catch (InterruptedException e) { }
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
			
		} // while
	}
	
	boolean eatFood() {return table.remove(food);}
}

class Cook implements Runnable{
	private Table table;
	
	Cook(Table table){this.table = table;}
	
	public void run() {
		while(true) {
			//임의의 요리를 선택해서 table에 추가한다.
			int idx = (int) (Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {Thread.sleep(10);} catch (InterruptedException e) { }
		} // while
	}
}

class Table{
	String[] dishNames = { "donut", "donut", "burger"}; //donut이 더 자주 나온다.
	final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {   // synchronized 추가
		//테이블에 음식이 가득찼으면, 테이블에 음식을 추가하지 않는다.
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name+ "is waiting.");
			try {
				wait();
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		dishes.add(dish);
		notify(); //COOK쓰레드를 깨우기 위함
		System.out.println("Dishes" + dishes.toString());
	}
	
	public void remove(String dishName) {
		//지정된 요리와 일치하는 요리를 테이블에서 제거한다.
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size()==0) {
				System.out.println(name+ " is waiting.");
				try { 
					wait();
					Thread.sleep(500);
					} catch (InterruptedException e) { }
			}
			
			while(true) {
				for(int i=0; i <dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); // 잠자고있는COOK쓰레드를 깨우기위함
						return;
					}
				} // for문의 끝
				
				try {
					System.out.println(name +" is waiting.");
					wait(); // 원하는 음식이 없는  CUST쓰레드를 기다리게한다.
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			} // while(true)
		} // synchronized
	}
	public int dishNum() {return dishNames.length;}
}