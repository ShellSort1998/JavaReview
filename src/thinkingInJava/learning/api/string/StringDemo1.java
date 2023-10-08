package thinkingInJava.learning.api.string;

import org.junit.Test;

public class StringDemo1 {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";

        String s5 = s1 + "world";   //����ƴ�ӣ�ͨ���鿴�ֽ����ļ����֣�������StringBuilder��toString()��������StringBuilder�е�toString()�����Ƿ������µ��ַ�������return new String();
        String s6 = "hello" + s2;   //����ƴ��
        String s7 = s1 + s2;        //����ƴ��


        System.out.println(s3 == s4);   //true
        System.out.println(s3 == s5);   //false
        System.out.println(s3 == s6);   //false
        System.out.println(s3 == s7);   //true  ����� => false
        System.out.println(s5 == s6);   //false
        System.out.println(s5 == s7);   //false
        System.out.println(s6 == s7);   //false

        System.out.println();
        String s8 = s5.intern();    //intern()���� ���ص����ַ����������������ĵ�ַ

        System.out.println(s8 == s3);
    }

    @Test
    public void test2() {
        //��String������final����ʱ��s1��Ϊ��������s1 + ��world"��Ϊ ����������
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";

        String s5 = s1 + "world";   //����ƴ�ӣ�ͨ���鿴�ֽ����ļ����֣�������StringBuilder��toString()��������StringBuilder�е�toString()�����Ƿ������µ��ַ�������return new String();
        String s6 = "hello" + s2;   //����ƴ��
        String s7 = s1 + s2;        //����ƴ��


        System.out.println(s3 == s5);   //true
        System.out.println(s3 == s6);   //true


    }

    /*
    contact()���������ײ�Դ��Ҳ��Ҫnew,�����Ƿ����¶���ĵ�ַ
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
