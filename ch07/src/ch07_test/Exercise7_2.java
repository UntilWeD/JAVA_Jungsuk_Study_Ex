package ch07_test;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		int j=0;
		
		for(int i=0;i<CARD_NUM;i++){
			cards[i] = new SutdaCard(++j, false);
			if(i == 0 || i == 2 || i == 7) {
				cards[i].isKwang= true;
			}
			if(j==10)
				j=0;
		}
	}
	
	void shuffle() {
		SutdaCard tmp;
		
		for(int i=0; i<CARD_NUM; i++) {
			tmp = cards[i];
			int ran = (int)(Math.random()*CARD_NUM+1);
			cards[i] = cards[ran];
			cards[ran] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*CARD_NUM+1)];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
		System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
