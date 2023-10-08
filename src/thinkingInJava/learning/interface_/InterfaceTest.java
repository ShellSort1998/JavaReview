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
    //ȫ�ֳ���
    public static final int MIN_SPEED = 0;

    //Ĭ�Ϸ��������з�����
    default void fun() {
        System.out.println("Ĭ�Ϸ���");
    }
    //��̬���������з�����
    static void fun2() {
        System.out.println("��̬����");
    }

    abstract void fun3();
}

class Plane implements Flyable {

    @Override
    public void fun3() {
        System.out.println("���󷽷�������ʵ��");
    }
}