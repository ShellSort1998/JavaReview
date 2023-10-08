package thinkingInJava.learning.innerClassTest;

public class InnerClassTest {
    public static void main(String[] args) {
        /*调用静态内部类*/
        Person.pet pet = new Person.pet();
        pet.eat("dog");

        /*调用非静态内部类*/
        Person.Bird bird = new Person().new Bird();
        bird.eat();

        bird.show("xixi");
    }
}

class Person {
    int age = 1;
    String name = "tom";
    //静态内部类
    static class pet {
        void eat(String petName) {
            System.out.println(petName+"吃骨头");
        }
    }

    //非静态内部类
    class Bird {
        String name = "啄木鸟";

        void eat() {
            System.out.println("鸟吃虫子");
        }

        public void show(String name) {
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("name = " + this.name);
            System.out.println("name = " + Person.this.name);
        }
    }
}