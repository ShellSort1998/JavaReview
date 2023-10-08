package thinkingInJava.learning.exception_.exer;

public class NoLifeValueException extends RuntimeException {

    static final long serialVersionUID = -3389564229948L;

    public NoLifeValueException(){}

    public NoLifeValueException(String m) {
        super(m);
    }
}
