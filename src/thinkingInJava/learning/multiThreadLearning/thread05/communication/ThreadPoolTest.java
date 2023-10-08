package thinkingInJava.learning.multiThreadLearning.thread05.communication;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {

    public static void main(String[] args) {
        //1.����ָ���߳��������̳߳�
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor executorService1 = (ThreadPoolExecutor) executorService;

        //�����̳߳�����
        executorService1.setMaximumPoolSize(50);    //�����̳߳����߳���������

        //2.ִ��ָ���̵߳Ĳ�������Ҫ�ṩʵ��Runnable��Callable�ӿڵ�ʵ����Ķ���
        executorService.execute(new NumberThread());//�ʺ�����Runnable
        executorService.execute(new NumberThread1());//�ʺ�����Runnable

//        executorService.submit(Callable callable);//�ʺ�����Callable

        //3.�ر����ӳ�
        executorService.shutdown();
    }

}

class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+" => "+i);
            }
        }
    }
}

class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+" => "+i);
            }
        }
    }
}