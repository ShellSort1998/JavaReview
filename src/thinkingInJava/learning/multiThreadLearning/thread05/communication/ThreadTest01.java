package thinkingInJava.learning.multiThreadLearning.thread05.communication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//两线程交替打印1-100

public class ThreadTest01 {
    public static void main(String[] args) {
        Print p1 = new Print("p1线程");
        Print p2 = new Print("p2线程");

        p1.start();
        p2.start();

    }
}

class Print extends Thread {
    public Print(String name) {
        super(name);
    }

    private static final Lock lock = new ReentrantLock();
    //定义一个共享的对象锁
    private static final Object lockObj = new Object();

    //共享数据
    private static int number = 1;

    @Override
    public void run() {

        while (true) {
            synchronized (Print.class) {
                //唤醒
                Print.class.notify();

                if (number <= 100) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " => " + number + "\n");
                    number++;

                    //当前阻塞一下
                    try {
                        Print.class.wait(); //线程一旦执行此方法，就进入等待。同时，会释放对同步监视器的调用
                        System.out.println("我在这");
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
