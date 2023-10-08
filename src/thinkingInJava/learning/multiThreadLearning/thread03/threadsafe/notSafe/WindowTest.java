package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.notSafe;

/**
 * 存在线程安全问题
 */


public class WindowTest {
    public static void main(String[] args) {
        SaleTicktet saleTicktet = new SaleTicktet();
        Thread t1 = new Thread(saleTicktet);
        Thread t2 = new Thread(saleTicktet);
        Thread t3 = new Thread(saleTicktet);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicktet implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized (this) {
//                if (ticket > 0) {
//                    System.out.println(Thread.currentThread().getName() + "售票，票号为： " + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售票，票号为： " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
