package thinkingInJava.learning.api.string;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StringMethodTest1 {

    /*
    (1) boolean isEmpty()���ж��Ƿ�Ϊ��
    (2) int length()�������ַ�������
    (3) String concat(xx)��ƴ���ַ���
    (4) boolean equals(Object obj)���Ƚ��ַ����Ƿ���ȣ����ִ�Сд
    (5) boolean equalsIgnoreCase(Object obj)���Ƚ��ַ����Ƿ���ȣ������ִ�Сд
    (6) int compareTo(String other)���Ƚ��ַ�����С�����ִ�Сд������Unicode����ֵ�Ƚ�
    (7) int compareToIgnoreCase(String other)���Ƚ��ַ�����С�������ִ�Сд
    (8) String toLowerCase()�����ַ���תСд
    (9) String toUpperCase()�����ַ���ת��д
    (10) String trim()��ȥ���ַ���ǰ��հ׷�
    (11) public String intern()��ʹ�ø��ַ������ַ����������й���
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
        System.out.println(s.compareTo(s2));    //������ߴ󣬸����ұߴ����Ϊ0���ײ�������һ���������� ��ߴ� e-E = 32
        char i = (char)'e' - 'E';
        System.out.println(i);

        System.out.println(s.compareToIgnoreCase(s2));


        //trim
        String s5 = "  1 23 4   ";
        System.out.println("**"+s5.trim()+"**");
    }

    /**
     * (1) boolean contains(xx) �ж��ַ����Ƿ����xx�Ӷ�
     * (2) int indexOf(xx)  ����xx�Ӷ����ַ����г��ֵ�λ�ã���ǰ�����ҵ���ǰ�ַ����е�xx�����ص�һ�γ��ֵ�������Ҫ��û���򷵻�-1
     * (3) int indexOf(String str, int fromIndex)   ����xx�Ӷ����ַ����г��ֵ�λ�ã���ָ������������ʼ�����ҵ���ǰ�ַ����е�xx�����ص�һ�γ��ֵ�������Ҫ��û���򷵻�-1
     * (4) int lastIndexOf(xx)  �Ӻ���ǰ�ҵ�ǰ�ַ����е�xx������з������һ�γ��ֵ��±꣬��û���򷵻�-1
     * (4) int lastIndexOf(String str, int fromIndex)  ��ָ����������ʼ��ǰ�ҵ�ǰ�ַ����е�xx������з������һ�γ��ֵ��±꣬��û���򷵻�-1
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
     * (1) String substring(int beginIndex)�� ����һ���µ��ַ��������ǴӴ��ַ�����beginIndex��ʼ��ȡ
     * (2) String substring(int beginIndex, int endIndex)�� ����һ���µ��ַ�������ȡ����[beginIndex, endIndex)
     */
    @Test
    public void test4() {
        String a = "abc�����1998";
        System.out.println(a.substring(2)); //c�����1998

        System.out.println(a.substring(2, 7));  //c�����1 ����ҿ�
    }

    /**
     * static String valueOf(char[] data):  ����ָ�������б�ʾ���ַ������У��������ַ���
     * static String valueOf(char[] data, int offset, int count):  ����ָ�������б�ʾ���ַ������У���ָ����λ�ã�����ȡcount�����������ַ���
     * static String copyValueOf(char[] data):  ��char���鿽��Ϊ�µ��ַ���
     * static String copyValueOf(char[] data, int offset, int count):  ��char���鿽��Ϊ�µ��ַ�������offset��ʼ������ȡcount����
     *
     * boolean startsWith(xx)    �ж��Ƿ���xx��ʼ
     * boolean startsWith(String prefix, int offset)     �жϴ�offset��ʼ���Ƿ���prefix��ʼ
     * boolean endsWith(xx)     �ж��Ƿ���xx��Ϊ��׺������
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
     * String replace(char oldChar, char newChar): ����һ���µ��ַ�������oldChar�滻ΪnewChar     ���ַ���
     * String replace(CharSequence target, CharSequence replacement): ʹ��ָ��������ֵ�滻
     * String replaceAll(String regex, String replacement): ʹ�ø�����replacement�滻���ַ�����regex
     * String replaceFirst(String regex, String replacement): ʹ�ø�����replacement�滻��һ�γ��ֵ�regex
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
