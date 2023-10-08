package thinkingInJava.learning.multiThreadLearning.thread04.deadLock;

public class ClassB implements Runnable {

    @Override
    public void run() {
        synchronized (DeadLockTest.lock2) {
            System.out.println("Thread 2: Holding lock2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for lock1...");
            synchronized (DeadLockTest.lock1) {
                System.out.println("Thread 2: Acquired lock1.");
            }
        }
    }
}
