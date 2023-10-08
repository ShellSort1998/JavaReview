package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.syncfunc;

public class Window3Test {
    public static void main(String[] args) {
        SaleTicketSyncFunc s = new SaleTicketSyncFunc();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 * ����ʵ�ֵ�ͬ������
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
     * ͬ������
     */
    public synchronized void sale() {   //ʹ��ͬ��������ͬ���������ݴ���
        if (ticket > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "��Ʊ�� Ʊ��Ϊ�� " + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
