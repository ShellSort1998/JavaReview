package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.syncfunc;

public class Window4Test {
    public static void main(String[] args) {
        SaleTicketsByExtend s1 = new SaleTicketsByExtend();
        SaleTicketsByExtend s2 = new SaleTicketsByExtend();
        SaleTicketsByExtend s3 = new SaleTicketsByExtend();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");


        s1.start();
        s2.start();
        s3.start();
    }
}

class SaleTicketsByExtend extends Thread {
    static int ticket = 100;
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
//            show();   //非静态的同步方法
            showByStatic();     //静态同步方法
        }
    }

    /**
     * 基于继承的同步方法
     */
    public synchronized void show() {   //基于继承实现多线程，其中的同步方法必须为静态的，若为非静态则意味着，此时的同步监视器为 this，但是new了三个，所以this不一致，进而导致不是一个同步监视器而出现线程安全问题
        if (ticket > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "窗口, " + "票号为： " + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }

    /**
     * 基于继承的静态同步方法
     */
    public static synchronized void showByStatic() {
        if (ticket > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "窗口, " + "票号为： " + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
