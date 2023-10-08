package thinkingInJava.learning.multiThreadLearning.thread02.methods;

public class MethodsTest {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new JoinFunTest(),"子线程");
        thread2.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "线程" + i + " 正在执行");
            }
            if (i == 20) {
                try {
                    System.out.println(thread2.getState());
                    thread2.join();
                    System.out.println(thread2.getState());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("子线程是否存活？ " + thread2.isAlive());
    }
}

class JoinFunTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "线程" + i + " 正在执行");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
