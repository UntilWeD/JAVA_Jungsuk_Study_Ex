package ch07_test;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int prev_channel;
	private int volume;
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int getChannel() {
		return channel;
	}
	int getVolume() {
		return volume;
	}
	
	void setChannel(int channel) {
		prev_channel = this.channel;
		this.channel = channel;
	}
	
	void setVolume(int volume) {
		this.volume = volume;
	}
	
	void gotoPrevChannel() {
		int tmp = channel;
		channel = prev_channel;
		prev_channel = tmp;
	}
}

public class Exercise7_11 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());


	}

}
