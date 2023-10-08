package thinkingInJava.learning.multiThreadLearning.thread04.deadLock;

public class DeadLockTest {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        System.out.println("线程开始");
        new Thread(classA).start();
        new Thread(classB).start();
        System.out.println("线程结束");
    }
}
