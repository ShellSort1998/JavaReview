package thinkingInJava.learning.multiThreadLearning.thread02.methods;

public class MethodsTest {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new JoinFunTest(),"���߳�");
        thread2.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "�߳�" + i + " ����ִ��");
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
        System.out.println("���߳��Ƿ�� " + thread2.isAlive());
    }
}

class JoinFunTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "�߳�" + i + " ����ִ��");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
