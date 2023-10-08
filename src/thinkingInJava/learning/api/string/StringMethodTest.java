package thinkingInJava.learning.api.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringMethodTest {
    @Test
    public void test1() {
        //String������
        /*
        public String()
        public String(String original)
        public String(char[] value)
        public String(char[] value,int offset, int count)
        public String(byte[] bytes)
        public String(byte[] bytes,String charsetName)
         */
    }

    /*
    String ��������

    1.String������������ͣ���װ���͵�ת��

    2.String��char[]����֮���ת��

    3.String��byte[]֮���ת����*��

     */
    @Test
    public void test2() {
        //String => ����
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);

        //���� => String
        int j = 456;
        String s1 = String.valueOf(j);
        System.out.println(s1);

        System.out.println(String.valueOf(true));
    }

    @Test
    public void test3() {
        //String��char[]����֮���ת��

        //�ַ���תchar����
        String a = "aabbcddefgg";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+", ");
        }
        System.out.println();

        //char����ת�ַ���
        char[] cs = new char[]{'a', 'c', 'd', 'e', 'h'};
        String s = new String(cs);
        System.out.println(s);
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        //String��byte[]֮���ת����*��

        //String => byte[]
        String a = "helloworld����";
        /*
        ��utf-8��һ������ռ3���ֽ�
        ��gbk��һ������ռ2���ֽ�
         */
        byte[] bytes = a.getBytes("gbk");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println();

        //byte[] => String
        byte[] b = new byte[]{123, 22, 109, 97, 65,-25,-112,-125,-100};
        String s = new String(b,"utf-8");
        System.out.println(s);
    }
}
