package thinkingInJava.learning.extends_;

public class ExtendsTest {
    public ExtendsTest() {
        System.out.println("父类1");
    }

    public void eat() {
        System.out.println("eat : 水果");
    }

    public static void main(String[] args) {
        new Test().eat();
    }
}

class Test extends ExtendsTest {
    public Test() {
        System.out.println("父类2");
    }

    @Override
    public void eat() {
        System.out.println("eat : 稀饭");
        super.eat();
    }
}

