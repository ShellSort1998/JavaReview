package thinkingInJava.learning.exception_;

//�Զ����쳣��
public class BelowZero extends Exception {
    /**
     * 1.�̳��쳣��ϵ
     * 2.���ؼ���������
     * 3.�ṩһ��ȫ�ֱ���
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
