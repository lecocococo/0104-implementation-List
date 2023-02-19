package exceptions;

public class CustomNoSuchElementException extends Exception {
    public CustomNoSuchElementException() {
        this("해당 원소는 존재하지 않음");
    }
    
    public CustomNoSuchElementException(String message) {
        super(message);
    }
}
