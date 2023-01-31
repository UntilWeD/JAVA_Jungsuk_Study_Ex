package ch06;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}

public class TvTest {

	public static void main(String[] args) {
		Tv t1;
		t1 = new Tv();
		t1.channel = 7;
		t1.channelDown();
		System.out.println("현재 채널은 " +  t1.channel +" 입니다.");
	}

}


