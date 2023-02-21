package ch07_test;

import java.util.Arrays;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; 
	int i = 0; 
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 살수 없습니다.");
		} else {
			money = money- p.price;
			add(p);
		}
	} //buy(Product p)
	
	void add(Product p) {
		if(i >= cart.length-1) {
			Product[] Ncart = new Product[cart.length*2];
			System.arraycopy(cart, 0, Ncart, 0, cart.length);
			cart = Ncart;
		}
		cart[i++] = p;
	} // add(Product p)
	
	void summary() {
		int sum=0, j=0;
		
		System.out.print("구입한물건:");
		while(cart[j]!=null) {
			System.out.print(cart[j]+",");
			sum += cart[j].price;
			j++;
		}
		System.out.println();
		System.out.println("사용한 금액:"+sum);
		System.out.println("남은 금액:"+(money));
	} // summary()

}

class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}
