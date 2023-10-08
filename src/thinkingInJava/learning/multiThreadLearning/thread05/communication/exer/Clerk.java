package thinkingInJava.learning.multiThreadLearning.thread05.communication.exer;

public class Clerk {
    private static int porductNum = 0; //产品数量

    //增加产品数量
    public void add() {
        synchronized (Clerk.class) {
            if (porductNum >= 20) {
                try {
                    //等待
                    Clerk.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                porductNum++;
                System.out.println(Thread.currentThread().getName() + "生产了第" + porductNum + "个产品。");

                Clerk.class.notify();
            }
        }
    }

    //减少产品数量
    public synchronized void minus() {
        if (porductNum <= 0) {
            try {
                //等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + porductNum + "个产品。");
            porductNum--;

            notify();
        }
    }
}
