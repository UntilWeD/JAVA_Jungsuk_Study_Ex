//package ch07_test;
//
//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM];
//	
//	SutdaDeck() {
//		int j=0;
//		
//		for(int i=0;i<CARD_NUM;i++){
//			cards[i] = new SutdaCard(++j, false);
//			if(i == 0 || i == 2 || i == 7) {
//				cards[i].isKwang= true;
//			}
//			if(j==10)
//				j=0;
//		}
//	}
//}
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//	
//	SutdaCard() {
//		this(1, true);
//	}
//	
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//	
//	public String toString() {
//		return num + ( isKwang ? "K":"");
//	}
//}
//
//public class Exercise7_1 {
//	public static void main(String[] args) {
//		SutdaDeck deck = new SutdaDeck();
//		
//		for(int i=0; i < deck.cards.length;i++)
//			System.out.print(deck.cards[i]+",");
//
//	}
//}
