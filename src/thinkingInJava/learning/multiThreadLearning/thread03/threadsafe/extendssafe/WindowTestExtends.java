package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.extendssafe;

public class WindowTestExtends {
    public static void main(String[] args) {
        SaleTicketExtend t1 = new SaleTicketExtend();
        SaleTicketExtend t2 = new SaleTicketExtend();
        SaleTicketExtend t3 = new SaleTicketExtend();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

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
//            synchronized (obj) { //使用静态的任一对象，作为共享的同步锁

            synchronized (SaleTicketExtend.class) { //利用反射，获取到当前类 结构： Class clz = SaleTicketExtend.class
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票， 票号为： " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}