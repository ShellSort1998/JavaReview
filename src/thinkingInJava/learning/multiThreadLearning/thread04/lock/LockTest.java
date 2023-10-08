package thinkingInJava.learning.multiThreadLearning.thread04.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        SaleTicktet saleTicktet = new SaleTicktet();
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

class SaleTicktet implements Runnable {
    int ticket = 100;

    //Lock����,ʹ�������̹߳��ø���
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try {
                lock.lock();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            synchronized (this) {
//                if (ticket > 0) {
//                    System.out.println(Thread.currentThread().getName() + "��Ʊ��Ʊ��Ϊ�� " + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "��Ʊ��Ʊ��Ϊ�� " + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}