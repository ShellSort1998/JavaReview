package thinkingInJava.learning.multiThreadLearning.thread01.createTheadTest;

import org.junit.Test;

/**
 * @author wwx
 * ���ִ����̵߳ķ���
 * 1.�̳�Thread�� ��дrun����
 * 2.ʵ��Runnable�ӿڣ���дrun����
 */
public class ThreadTest{

    public static void main(String[] args) {
        //ͨ�������ڲ������
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 2 == 0) {
                        System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
                    }
                }
            }
        }).start();
    }
    @Test
    public void extendsThreadTest() {
        //�̵߳�ִ��
        B b1 = new B();
        B b2 = new B();
        b1.start();
        b2.start();

        //test ������ִ��
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
            }
        }
    }

    @Test
    public void implementsRunnableTest() {
        A a = new A();
        //��ʵ��a��Ϊ���� ����Thread�������У��ٵ���start()
        Thread at1 = new Thread(a);
        Thread at2 = new Thread(a);
        at1.start();
        at2.start();

        //test ������ִ��
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
            }
        }
    }

    @Test
    public void runnableTestByAnotherWay() {
        //ͨ�������ڲ������
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 2 == 0) {
                        System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
                    }
                }
            }
        }).start();
    }

    @Test
    public void evenOrOddNumber() {
        Thread findEven = new FindEven();
        Thread findOdd = new FindOdd();
        findEven.start();
        findOdd.start();
    }

    @Test
    public void evenOrOddNumberByAnotherWay() {


        //����Thread�����������������߳�

        //�߳�һ
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 2 == 0) {
                        System.out.println("[ " + Thread.currentThread().getName() + " ] -even number is: [ " + i + " ] ");
                    }
                }
            }
        }.start();

        //�̶߳�
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 2 != 0) {
                        System.out.println("[ " + Thread.currentThread().getName() + " ] -odd number is: [ " + i + " ] ");
                    }
                }
            }
        }.start();
    }
}
class B extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+", ");
            }
        }
    }
}

class A implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
            }
        }
    }
}

class FindEven extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("[ " + Thread.currentThread().getName() + " ] -even number is: [ " + i + " ] ");
            }
        }
    }
}

class FindOdd extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("[ " + Thread.currentThread().getName() + " ] -odd number is: [ " + i + " ] ");
            }
        }
    }
}
