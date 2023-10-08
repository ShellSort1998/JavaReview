package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.syncfunc;

public class Window3Test {
    public static void main(String[] args) {
        SaleTicketSyncFunc s = new SaleTicketSyncFunc();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 * 基于实现的同步方法
 */
class SaleTicketSyncFunc implements Runnable {
    int ticket = 100;
    boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag) {
            sale();
        }
    }

    /**
     * 同步方法
     */
    public synchronized void sale() {   //使用同步方法来同步共享数据代码
        if (ticket > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票， 票号为： " + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
