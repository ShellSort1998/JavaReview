package thinkingInJava.learning.multiThreadLearning.thread05.communication;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {

    public static void main(String[] args) {
        //1.创建指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor executorService1 = (ThreadPoolExecutor) executorService;

        //设置线程池属性
        executorService1.setMaximumPoolSize(50);    //设置线程池中线程数的上线

        //2.执行指定线程的操作。需要提供实现Runnable或Callable接口的实现类的对象
        executorService.execute(new NumberThread());//适合用于Runnable
        executorService.execute(new NumberThread1());//适合用于Runnable

//        executorService.submit(Callable callable);//适合用于Callable

        //3.关闭连接池
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