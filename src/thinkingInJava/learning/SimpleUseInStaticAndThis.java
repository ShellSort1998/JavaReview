package thinkingInJava.learning;

public class SimpleUseInStaticAndThis {
    static void f1() {
        System.out.println("f1");
//        this.f2();      //静态方法不能调用非静态方法
    }

    void f2() {
        System.out.println("f2");
        SimpleUseInStaticAndThis.f1();
    }

    public static void main(String[] args) {
        SimpleUseInStaticAndThis.f1();
    }
}
