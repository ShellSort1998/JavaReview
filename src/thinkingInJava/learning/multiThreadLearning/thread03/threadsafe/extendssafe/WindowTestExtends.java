package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.extendssafe;

public class WindowTestExtends {
    public static void main(String[] args) {
        SaleTicketExtend t1 = new SaleTicketExtend();
        SaleTicketExtend t2 = new SaleTicketExtend();
        SaleTicketExtend t3 = new SaleTicketExtend();

        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicketExtend extends Thread {
    int ticket = 100;
    static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
//            synchronized (obj) { //ʹ�þ�̬����һ������Ϊ�����ͬ����

            synchronized (SaleTicketExtend.class) { //���÷��䣬��ȡ����ǰ�� �ṹ�� Class clz = SaleTicketExtend.class
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "��Ʊ�� Ʊ��Ϊ�� " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}