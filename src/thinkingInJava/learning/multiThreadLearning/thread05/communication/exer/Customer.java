package thinkingInJava.learning.multiThreadLearning.thread05.communication.exer;

public class Customer implements Runnable{
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("�����߿�ʼ����...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.minus();
        }
    }
}
