package thinkingInJava.learning.api.string;

import org.junit.Test;

public class StringDemo1 {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";

        String s5 = s1 + "world";   //变量拼接，通过查看字节码文件发现：调用了StringBuilder的toString()方法，而StringBuilder中的toString()方法是返回了新的字符串对象：return new String();
        String s6 = "hello" + s2;   //变量拼接
        String s7 = s1 + s2;        //变量拼接


        System.out.println(s3 == s4);   //true
        System.out.println(s3 == s5);   //false
        System.out.println(s3 == s6);   //false
        System.out.println(s3 == s7);   //true  答错了 => false
        System.out.println(s5 == s6);   //false
        System.out.println(s5 == s7);   //false
        System.out.println(s6 == s7);   //false

        System.out.println();
        String s8 = s5.intern();    //intern()方法 返回的是字符串常量池字面量的地址

        System.out.println(s8 == s3);
    }

    @Test
    public void test2() {
        //当String变量被final修饰时，s1变为常量，则s1 + ”world"即为 常量＋常量
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";

        String s5 = s1 + "world";   //变量拼接，通过查看字节码文件发现：调用了StringBuilder的toString()方法，而StringBuilder中的toString()方法是返回了新的字符串对象：return new String();
        String s6 = "hello" + s2;   //变量拼接
        String s7 = s1 + s2;        //变量拼接


        System.out.println(s3 == s5);   //true
        System.out.println(s3 == s6);   //true


    }

    /*
    contact()方法，看底层源码也需要new,所以是返回新对象的地址
     */
    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = s1.concat(s2);
        System.out.println(s3==s4);
    }
}
