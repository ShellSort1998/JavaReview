package thinkingInJava.learning.api.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringMethodTest {
    @Test
    public void test1() {
        //String构造器
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
    String 常见方法

    1.String与基本数据类型，包装类型的转换

    2.String与char[]数组之间的转换

    3.String与byte[]之间的转换（*）

     */
    @Test
    public void test2() {
        //String => 基本
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);

        //基本 => String
        int j = 456;
        String s1 = String.valueOf(j);
        System.out.println(s1);

        System.out.println(String.valueOf(true));
    }

    @Test
    public void test3() {
        //String与char[]数组之间的转换

        //字符串转char数组
        String a = "aabbcddefgg";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+", ");
        }
        System.out.println();

        //char数组转字符串
        char[] cs = new char[]{'a', 'c', 'd', 'e', 'h'};
        String s = new String(cs);
        System.out.println(s);
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        //String与byte[]之间的转换（*）

        //String => byte[]
        String a = "helloworld地球";
        /*
        在utf-8中一个汉字占3个字节
        在gbk中一个汉字占2个字节
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
