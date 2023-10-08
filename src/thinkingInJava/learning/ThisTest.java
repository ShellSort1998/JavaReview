package thinkingInJava.learning;

public class ThisTest {
    public int anInt;

    public ThisTest() {
        System.out.println("this()调用成功");
    }

    public ThisTest(int anInt) {
        this();
        this.anInt = anInt;
        System.out.println("第二个构造器调用成功 " + this.anInt);
    }

    public static void main(String[] args) {
        int anInt = 10;
        new ThisTest(anInt);
    }
}
