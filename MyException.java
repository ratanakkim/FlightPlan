public class MyException extends Exception {
    public MyException(String message) {
	super(message);
	err = message;
    }

    public String err;
}
