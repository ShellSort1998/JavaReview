package thinkingInJava.learning;

public class InitializationTest {
    static String s1 = "a";
    static String s2;
    static{
        s2 = "b";
    }

    static void f1() {
        System.out.println(s1+"\n"+s2);
    }

    public static void main(String[] args) {
        InitializationTest.f1();
    }
}
