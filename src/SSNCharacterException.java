
public class SSNCharacterException extends Exception{
	public SSNCharacterException() {
		super("Social security number character exception");
	}
	
	public SSNCharacterException(String message) {
		super(message);
	}
}
