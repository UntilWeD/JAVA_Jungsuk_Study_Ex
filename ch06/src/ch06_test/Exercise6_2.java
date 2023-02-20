package ch06_test;

class SutdaCard{
	int num;
	boolean isKwang;
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang; 
	}
	
	public SutdaCard() {
		this.num = (int)(Math.random() * 10+1);
		this.isKwang = true;
	}
	
	String info() {
		if(isKwang) {
			return num+"K";
		} else {
			return num+"";
		}
			
	}
	
}

public class Exercise6_2 {
	public static void main(String[] args) {
		SutdaCard card1 =new SutdaCard(3, false);
		SutdaCard card2 =new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
