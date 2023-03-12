package ch13_test;

public class Exercise13_1 {

	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i < 300; i++) {
					System.out.print('-');
				}
				
			}
		};
		
		Thread th1 = new Thread(runnable1);
		
		th1.start();
	}

}
