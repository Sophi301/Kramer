public class SizeMismatchException extends Exception {
    
    SizeMismatchException(String message) {
        super(message);
    }

    SizeMismatchException() {
        this("Mismatched sizes between two matrix or vectors.");
    }
}
