package thinkingInJava.learning.junit_;

import org.junit.Test;

import java.util.Arrays;

public class JunitTest {
    @Test
    public void test() {
        byte[] bytes = "hi junit".getBytes();
        System.out.println(bytes);
    }

    @Test
    public void test1() {
        //String 中的基本转包装类型
        int a = 132;
        boolean b = true;
        String s = String.valueOf(a);
        String bs = String.valueOf(b);
        System.out.println(s + " " + bs);
    }

    @Test
    public void test2() {
        //String 中的包装类型转基本类型
        String ss = "1234" +
                "6548";
        int a = Integer.parseInt(ss);
        System.out.println(a);

        String sb = "true";
        boolean b = Boolean.parseBoolean(sb);
        System.out.println(b);

    }

    @Test
    public void test3() {
        Integer i = new Integer(2);
        Integer j = new Integer(2);
        System.out.println(i == j); //false

        Integer m = 2;
        Integer n = 2;
        System.out.println(m == n); //true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); //false
    }
}
