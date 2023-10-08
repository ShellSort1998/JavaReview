package thinkingInJava.learning.exception_.exer4;

public class BelowZeroException extends Exception {
    static final long serialVersionUID = -3387511243234123948L;

    public BelowZeroException() {
        super();
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
