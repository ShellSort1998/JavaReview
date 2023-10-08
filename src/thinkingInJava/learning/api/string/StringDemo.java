package thinkingInJava.learning.api.string;

import org.junit.Test;

public class StringDemo {
    @Test
    public void test1() {
        String s1 = "hello";    //������ַ����������У�������ͬ���ַ�������ֻ������һ�ݡ�
        String s2 = "hello";

        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        //�ַ������ɱ���
        String s1 = "hello";    //������ַ����������У�������ͬ���ַ�������ֻ������һ�ݡ�
        String s2 = "hello";

        s2 = "hi";
        System.out.println(s1);
    }

    @Test
    public void test3() {
        //��ע�⣬��Ϊƴ�ӵĻ������µ��ַ����������ַ����������У������ڶ���new��һ��ƴ�Ӻ���ַ�������
        String s1 = "hello";    //������ַ����������У�������ͬ���ַ�������ֻ������һ�ݡ�
        String s2 = "hello";

        s2 += "world";
        System.out.println(s1); //hello
        System.out.println(s2); //helloworld
    }

    @Test
    public void Test4() {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace("l", "W");

        System.out.println(s1); //hello
        System.out.println(s2); //hello
        System.out.println(s3); //heWWo
    }

    @Test
    public void test5() {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "tom";
        p2.name = "tom";

        p1.name = "bill";

        System.out.println(p1.name);    //bill
        System.out.println(p2.name);    //tom
    }
}

class Person {
    String name;
}
