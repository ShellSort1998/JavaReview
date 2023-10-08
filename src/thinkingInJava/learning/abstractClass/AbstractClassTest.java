package thinkingInJava.learning.abstractClass;

public class AbstractClassTest {
    public static void main(String[] args) {
        B b = new B("123");
        b.fun1();
        b.fun2();
    }
}

abstract class A {

    public String a;
    private String b;

    public A(String a) {
        this.a = a;
    }

    void fun1() {
        System.out.println("a = " + this.a);
    }

    abstract void fun2();
}

class B extends A{

    public B(String a) {
        super(a);
    }

    @Override
    void fun2() {
        System.out.println("heihei");
    }
}
