package thinkingInJava.learning.multiThreadLearning.thread04.deadLock;

public class ClassA implements Runnable {


    @Override
    public void run() {
        synchronized (DeadLockTest.lock1) {
            System.out.println("Thread 1: Holding lock1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for lock2...");
            synchronized (DeadLockTest.lock2) {
                System.out.println("Thread 1: Acquired lock2.");
            }
        }
    }
}
