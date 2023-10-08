package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.runnablesafe;


public class WindowTestSafe {
    public static void main(String[] args) {
        SaleTicketSafe saleTicktet = new SaleTicketSafe();
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

class SaleTicketSafe implements Runnable {
    int ticket = 100;

    //同步监视器
    Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //同步代码块
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，票号为： " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
