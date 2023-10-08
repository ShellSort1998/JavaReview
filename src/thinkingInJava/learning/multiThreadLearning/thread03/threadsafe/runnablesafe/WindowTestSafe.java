package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.runnablesafe;


public class WindowTestSafe {
    public static void main(String[] args) {
        SaleTicketSafe saleTicktet = new SaleTicketSafe();
        Thread t1 = new Thread(saleTicktet);
        Thread t2 = new Thread(saleTicktet);
        Thread t3 = new Thread(saleTicktet);

        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicketSafe implements Runnable {
    int ticket = 100;

    //ͬ��������
    Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //ͬ�������
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "��Ʊ��Ʊ��Ϊ�� " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
