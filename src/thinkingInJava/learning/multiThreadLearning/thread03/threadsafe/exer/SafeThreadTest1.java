package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.exer;

/**
 * 3个人 每人喊一下 倒计时60s
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
//  同步代码块
//    public void countDown() {
//        synchronized (HappyNewYear.class) { //同步监视器或者使用 this
//            if (count > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"说： 倒计时：" + count);
//                count--;
//            } else {
//                System.out.println("Happy New Year!!");
//                isFlag = false;
//            }
//        }
//    }

    //同步方法
    public synchronized void countDown() {
        if (count > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"说： 倒计时：" + count);
            count--;
        } else {
            System.out.println("Happy New Year!!");
            isFlag = false;
        }
    }

}
