package thinkingInJava.learning.interface_;

public class InterfaceTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fun();
        Flyable.fun2();
        plane.fun3();
    }
}

interface Flyable {
    //全局常量
    public static final int MIN_SPEED = 0;

    //默认方法可以有方法体
    default void fun() {
        System.out.println("默认方法");
    }
    //静态方法可以有方法体
    static void fun2() {
        System.out.println("静态方法");
    }

    abstract void fun3();
}

class Plane implements Flyable {

    @Override
    public void fun3() {
        System.out.println("抽象方法的子类实现");
    }
}