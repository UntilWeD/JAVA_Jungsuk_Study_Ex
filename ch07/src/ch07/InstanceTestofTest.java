package ch07;

public class InstanceTestofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is FireEngine instance.");
		}
		
		if( fe instanceof Car) {
			System.out.println("This is Car instance.");
		}
		
		if( fe instanceof Object) {
			System.out.println("This is Object instance.");
		}
		
		System.out.println(fe.getClass().getName());
	}

}
