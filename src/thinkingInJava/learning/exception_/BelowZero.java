package thinkingInJava.learning.exception_;

//自定义异常类
public class BelowZero extends Exception {
    /**
     * 1.继承异常体系
     * 2.重载几个构造器
     * 3.提供一个全局遍历
     */
    static final long serialVersionUID = -338751699564229948L;

    public BelowZero() {

    }

    public BelowZero(String message) {
        super(message);
    }

    public BelowZero(String message, Throwable cause) {
        super(message,cause);
    }
}
