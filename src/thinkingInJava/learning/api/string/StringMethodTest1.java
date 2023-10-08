package thinkingInJava.learning.api.string;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StringMethodTest1 {

    /*
    (1) boolean isEmpty()：判断是否为空
    (2) int length()：返回字符串长度
    (3) String concat(xx)：拼接字符串
    (4) boolean equals(Object obj)：比较字符串是否相等，区分大小写
    (5) boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写
    (6) int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较
    (7) int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
    (8) String toLowerCase()：将字符串转小写
    (9) String toUpperCase()：将字符串转大写
    (10) String trim()：去掉字符串前后空白符
    (11) public String intern()：使得该字符串在字符串常量池中共享。
     */
    @Test
    public void test1() {
        String s = "WeRhFg";
        String s1 = "12314";
        String s2 = "WERhfG";
        System.out.println(s.isEmpty());

        System.out.println(s1.length());
        System.out.println(s.concat(s1));

        System.out.println(s.equalsIgnoreCase(s2));

    }

    @Test
    public void test2() {
        String s = "WeRhFg";
        String s1 = "12314";
        String s2 = "WERhfG";
        System.out.println(s.compareTo(s2));    //正的左边大，负的右边大，相等为0，底层是做了一个减法操作 左边大 e-E = 32
        char i = (char)'e' - 'E';
        System.out.println(i);

        System.out.println(s.compareToIgnoreCase(s2));


        //trim
        String s5 = "  1 23 4   ";
        System.out.println("**"+s5.trim()+"**");
    }

    /**
     * (1) boolean contains(xx) 判断字符串是否包含xx子段
     * (2) int indexOf(xx)  给出xx子段在字符串中出现的位置，从前往后找到当前字符串中的xx，返回第一次出现的索引，要是没有则返回-1
     * (3) int indexOf(String str, int fromIndex)   给出xx子段在字符串中出现的位置，从指定的索引处开始往后找到当前字符串中的xx，返回第一次出现的索引，要是没有则返回-1
     * (4) int lastIndexOf(xx)  从后往前找当前字符串中的xx，如果有返回最后一次出现的下标，若没有则返回-1
     * (4) int lastIndexOf(String str, int fromIndex)  从指定索引出开始往前找当前字符串中的xx，如果有返回最后一次出现的下标，若没有则返回-1
     */
    @Test
    public void test3() {
        //boolean contains(xx)
        String a = "abcdefg";
        boolean result = a.contains("cd");
        System.out.println(result);

        //int indexOf(xx)
        System.out.println(a.indexOf("cd"));    //2

        //int indexOf(String str, int fromIndex)
        System.out.println(a.indexOf("cd", 2));    //2
        System.out.println(a.indexOf("cd", 3));    //-1

        //int lastIndexOf(xx)
        System.out.println(a.lastIndexOf("cd"));    //2

        //int lastIndexOf(String str, int fromIndex)
        System.out.println(a.lastIndexOf("cd", 2));     //2

    }

    /**
     * (1) String substring(int beginIndex)： 返回一个新的字符串，他是从此字符串的beginIndex开始截取
     * (2) String substring(int beginIndex, int endIndex)： 返回一个新的字符串，截取区间[beginIndex, endIndex)
     */
    @Test
    public void test4() {
        String a = "abc你好吗1998";
        System.out.println(a.substring(2)); //c你好吗1998

        System.out.println(a.substring(2, 7));  //c你好吗1 左闭右开
    }

    /**
     * static String valueOf(char[] data):  返回指定数组中表示该字符的序列，生成新字符串
     * static String valueOf(char[] data, int offset, int count):  返回指定数组中表示该字符的序列，从指定的位置，向后截取count个，生成新字符串
     * static String copyValueOf(char[] data):  将char数组拷贝为新的字符串
     * static String copyValueOf(char[] data, int offset, int count):  将char数组拷贝为新的字符串，从offset开始，向后截取count个。
     *
     * boolean startsWith(xx)    判断是否以xx开始
     * boolean startsWith(String prefix, int offset)     判断从offset开始，是否以prefix开始
     * boolean endsWith(xx)     判断是否以xx作为后缀结束。
     */
    @Test
    public void test5() {
        String s = String.valueOf(new char[]{'c', 'd', 'e', 'f', 'd', 's'});    //cdefds
        String s2 = String.valueOf(new char[]{'c', 'd', 'e', 'f', 'd', 's'},2,4);   //efds
        System.out.println(s);
        System.out.println(s2);

        String s3 = String.copyValueOf(new char[]{'h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd'});
        System.out.println(s3);

        System.out.println(s3.startsWith("hel"));   //true
        System.out.println(s3.startsWith("llo", 2));    //true
        System.out.println(s3.endsWith("rld")); //true
    }

    /**
     * String replace(char oldChar, char newChar): 返回一个新的字符串，将oldChar替换为newChar     新字符串
     * String replace(CharSequence target, CharSequence replacement): 使用指定的字面值替换
     * String replaceAll(String regex, String replacement): 使用给定的replacement替换此字符串中regex
     * String replaceFirst(String regex, String replacement): 使用给定的replacement替换第一次出现的regex
     */
    @Test
    public void test6() {
        String s = "hello";
        System.out.println(s.replace("l", "c"));    //he::o
        System.out.println(s.replace("llo", "xxs"));    //hexxs
    }
    @Test
    public void leetcodeTest() {

    }

}
