package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.exer;

/**
 * 3���� ÿ�˺�һ�� ����ʱ60s
 */
public class SafeThreadTest1 {
    public static void main(String[] args) {
        HappyNewYear happyNewYear = new HappyNewYear();
        Thread thread1 = new Thread(happyNewYear);
        Thread thread2 = new Thread(happyNewYear);
        Thread thread3 = new Thread(happyNewYear);

        thread1.setName("people1");
        thread2.setName("people2");
        thread3.setName("people3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class HappyNewYear implements Runnable {
    int count = 60;
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            countDown();
        }
    }
//  ͬ�������
//    public void countDown() {
//        synchronized (HappyNewYear.class) { //ͬ������������ʹ�� this
//            if (count > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"˵�� ����ʱ��" + count);
//                count--;
//            } else {
//                System.out.println("Happy New Year!!");
//                isFlag = false;
//            }
//        }
//    }

    //ͬ������
    public synchronized void countDown() {
        if (count > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"˵�� ����ʱ��" + count);
            count--;
        } else {
            System.out.println("Happy New Year!!");
            isFlag = false;
        }
    }

}
