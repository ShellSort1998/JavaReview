package thinkingInJava.learning.polymorphism;

public class DuoTaiTest {
    public static void main(String[] args) {
        //多态，父类引用指向子类对象
        Person p1 = new Man();
        Person p2 = new Woman();
        //多态的应用
        p1.eat();
        p2.eat();

        //多态不能直接调用子类特有的结构
//        p1.joy();

        //向下转型
        Man m = (Man) p1;
        m.joy();
    }
}

class Person {
    void eat() {
        System.out.println("人吃饭 ----父类");
    }
}

class Man extends Person {
    @Override
    void eat() {
        System.out.println("男人吃----子类");
    }

    void joy() {
        System.out.println("man play");
    }
}

class Woman extends Person {
    @Override
    void eat() {
        System.out.println("女人吃----子类");
    }
}