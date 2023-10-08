package thinkingInJava.learning.multiThreadLearning.thread05.communication.exer;

public class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("�����߿�ʼ������Ʒ...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.add();
        }
    }

}
