package ch08;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try(CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);
		}catch (WorkException e) {
			e.printStackTrace();
		}catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);
		}catch (WorkException e) {
			e.printStackTrace();
		}catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

}

class CloseableResource implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException{
		System.out.println("exceptionWork("+exception+")가 호출됨");
		
		if (exception) {
			throw new WorkException("WorkException발생!!!");
		}
	}
	
	public void close() throws CloseException{
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생");
	}
}

class WorkException extends Exception{
	public WorkException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}

class CloseException extends Exception{
	public CloseException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}