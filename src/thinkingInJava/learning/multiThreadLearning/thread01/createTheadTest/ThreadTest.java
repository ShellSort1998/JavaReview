package thinkingInJava.learning.multiThreadLearning.thread01.createTheadTest;

import org.junit.Test;

/**
 * @author wwx
 * 两种创建线程的方法
 * 1.继承Thread类 重写run方法
 * 2.实现Runnable接口，重写run方法
 */
public class ThreadTest{

    public static void main(String[] args) {
        //通过匿名内部类调用
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
        //线程的执行
        B b1 = new B();
        B b2 = new B();
        b1.start();
        b2.start();

        //test 方法的执行
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
            }
        }
    }

    @Test
    public void implementsRunnableTest() {
        A a = new A();
        //将实例a作为参数 传入Thread构造器中，再调用start()
        Thread at1 = new Thread(a);
        Thread at2 = new Thread(a);
        at1.start();
        at2.start();

        //test 方法的执行
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("[ "+Thread.currentThread().getName()+" ] "+i+" ");
            }
        }
    }

    @Test
    public void runnableTestByAnotherWay() {
        //通过匿名内部类调用
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


        //创建Thread的匿名子类来开启线程

        //线程一
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

        //线程二
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
