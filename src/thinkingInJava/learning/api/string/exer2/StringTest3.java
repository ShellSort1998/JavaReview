package thinkingInJava.learning.api.string.exer2;

/**
 * ��ȡһ���ַ�������һ���ַ����г��ֵĴ���
 *     �磺��ȡ"adk"�� "abkkcadkabkaadkwavab" �г��ֵĴ���
 */
public class StringTest3 {

    public static void main(String[] args) {
        String s = "abkkcadkabksadkwavab";
        int count = countStr(s, "adk");
        System.out.println(count);
    }

    public static int countStr(String str, String subStr) {
        //ʹ��indexOf()����
        int count = 0;

        int index = str.indexOf(subStr);

        while (index >= 0) {
            count++;
            index = str.indexOf(subStr, index + subStr.length());
        }

        return count;
    }
}

