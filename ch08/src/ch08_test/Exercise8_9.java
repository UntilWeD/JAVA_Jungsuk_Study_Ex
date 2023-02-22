package ch08_test;

class UnsupportedFunctionException extends RuntimeException{
	final private int ERR_CODE = 100;
	
	public UnsupportedFunctionException(String err, int err_code) {
		super(err);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "["+ERR_CODE+"]"+super.getMessage();
	}
}

public class Exercise8_9 {
	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
	}

}
