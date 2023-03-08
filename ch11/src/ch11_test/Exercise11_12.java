//package ch11_test;
//
//import java.util.*;
//
//public class Exercise11_12 {
//	
//	public static void main(String[] args) throws Exception{
//		SutdaDeck deck = new SutdaDeck();
//		deck.shuffle();
//		
//		Player p1 = new Player("타짜", deck.pick(), deck.pick()); 
//		Player p2 = new Player("고수", deck.pick(), deck.pick());
//		
//		System.out.println(p1+" "+deck.getPoint(p1));
//		System.out.println(p2+" "+deck.getPoint(p2));
//	}
//}

//
//
//class SutdaDeck
//{
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM];
//	
//	int pos = 0; // 다음에 가져올 카드의 위치
//	HashMap jokbo = new HashMap(); // 족보를 저장할 HashMap
//	
//	SutdaDeck() {
//		for(int i=0;i < cards.length;i++) {
//			int num = i%10+1;
//			boolean isKwang = i < 10 && (num==1 || num==3 || num==8);
//			
//			cards[i] = new SutdaCard(num,isKwang);
//		}
//
//		registerJokbo(); // 족보를 등록한다.
//	}
//	
//	void registerJokbo() {
//		jokbo.put("KK", 4000);
//		int score = 3000;
//		for(int i = 10; i>0; i--) {
//			jokbo.put((i+"")+(i+""), score+(i*10));
//		}
//		
//		jokbo.put("12", 2060); jokbo.put("14", 2050); jokbo.put("19", 2040);
//		jokbo.put("21", 2060); jokbo.put("41", 2050); jokbo.put("91", 2040);
//		jokbo.put("110", 2030); jokbo.put("410", 2020); jokbo.put("46", 2010);
//		jokbo.put("101", 2030); jokbo.put("104", 2020); jokbo.put("64", 2010);
//	}
//	
//	int getPoint(Player p) {
//		if(p==null) return 0;
//		
//		SutdaCard c1 = p.c1;
//		SutdaCard c2 = p.c2;
//		
//		Integer result = 0;
//		
//		if(c1.isKwang && c2.isKwang) {
//			result =Integer.parseInt((jokbo.get("KK")).toString());
//		} else if ((jokbo.get((" "+c1.num) + (" "+c2.num))) != null) {
//			result = Integer.parseInt(jokbo.get((" "+c1.num) + (" "+c2.num)).toString());
//		} else {
//			result = (c1.num + c2.num) % 10 + 1000;
//		}
//		
//		return result.intValue();
//	}
//	
//	SutdaCard pick() throws Exception {
//		SutdaCard c = null;
//		
//		if(0 <= pos && pos < CARD_NUM) {
//			c = cards[pos];
//			cards[pos++] = null;
//		} else {
//			throw new Exception("남아있는 카드가 없습니다."); 
//		}
//			return c;
//	}
//	
//	void shuffle() {
//		for(int x=0; x < CARD_NUM * 2; x++) {
//			int i = (int)(Math.random() * CARD_NUM);
//			int j = (int)(Math.random() * CARD_NUM);
//			
//			SutdaCard tmp = cards[i];
//			cards[i] = cards[j];
//			cards[j] = tmp;
//		}
//	}
//} // SutdaDeck
//
//class Player {
//	String name;
//	SutdaCard c1;
//	SutdaCard c2;
//	
//	int point; // 카드의 등급에 따른 점수 - 새로 추가
//	
//	Player(String name, SutdaCard c1, SutdaCard c2) {
//		this.name = name ;
//		this.c1 = c1 ;
//		this.c2 = c2 ;
//	}
//	
//	public String toString() {
//		return "["+name+"]"+ c1.toString() +","+ c2.toString();
//	}
//	
//} // class Player
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



