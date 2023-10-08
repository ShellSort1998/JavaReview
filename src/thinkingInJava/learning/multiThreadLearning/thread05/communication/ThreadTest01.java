package thinkingInJava.learning.multiThreadLearning.thread05.communication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//���߳̽����ӡ1-100

public class ThreadTest01 {
    public static void main(String[] args) {
        Print p1 = new Print("p1�߳�");
        Print p2 = new Print("p2�߳�");

        p1.start();
        p2.start();

    }
}

class Print extends Thread {
    public Print(String name) {
        super(name);
    }

    private static final Lock lock = new ReentrantLock();
    //����һ������Ķ�����
    private static final Object lockObj = new Object();

    //��������
    private static int number = 1;

    @Override
    public void run() {

        while (true) {
            synchronized (Print.class) {
                //����
                Print.class.notify();

                if (number <= 100) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " => " + number + "\n");
                    number++;

                    //��ǰ����һ��
                    try {
                        Print.class.wait(); //�߳�һ��ִ�д˷������ͽ���ȴ���ͬʱ�����ͷŶ�ͬ���������ĵ���
                        System.out.println("������");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }

    }
}
