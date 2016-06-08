
public class SSNLengthException extends Exception {
	public SSNLengthException() {
		super("Social security number length exception");
	}
	
	public SSNLengthException(String message) {
		super(message);
	}
}
