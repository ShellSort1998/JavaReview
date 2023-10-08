package thinkingInJava.learning.multiThreadLearning.thread05.communication.exer;

public class Clerk {
    private static int porductNum = 0; //��Ʒ����

    //���Ӳ�Ʒ����
    public void add() {
        synchronized (Clerk.class) {
            if (porductNum >= 20) {
                try {
                    //�ȴ�
                    Clerk.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                porductNum++;
                System.out.println(Thread.currentThread().getName() + "�����˵�" + porductNum + "����Ʒ��");

                Clerk.class.notify();
            }
        }
    }

    //���ٲ�Ʒ����
    public synchronized void minus() {
        if (porductNum <= 0) {
            try {
                //�ȴ�
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "�����˵�" + porductNum + "����Ʒ��");
            porductNum--;

            notify();
        }
    }
}
