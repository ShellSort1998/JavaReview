package thinkingInJava.learning.innerClassTest;

public class InnerClassTest {
    public static void main(String[] args) {
        /*���þ�̬�ڲ���*/
        Person.pet pet = new Person.pet();
        pet.eat("dog");

        /*���÷Ǿ�̬�ڲ���*/
        Person.Bird bird = new Person().new Bird();
        bird.eat();

        bird.show("xixi");
    }
}

class Person {
    int age = 1;
    String name = "tom";
    //��̬�ڲ���
    static class pet {
        void eat(String petName) {
            System.out.println(petName+"�Թ�ͷ");
        }
    }

    //�Ǿ�̬�ڲ���
    class Bird {
        String name = "��ľ��";

        void eat() {
            System.out.println("��Գ���");
        }

        public void show(String name) {
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("name = " + this.name);
            System.out.println("name = " + Person.this.name);
        }
    }
}