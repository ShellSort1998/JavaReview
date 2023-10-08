package thinkingInJava.learning.api.string.exer2;

/**
 * 获取一个字符串在另一个字符串中出现的次数
 *     如：获取"adk"在 "abkkcadkabkaadkwavab" 中出现的次数
 */
public class StringTest3 {

    public static void main(String[] args) {
        String s = "abkkcadkabksadkwavab";
        int count = countStr(s, "adk");
        System.out.println(count);
    }

    public static int countStr(String str, String subStr) {
        //使用indexOf()方法
        int count = 0;

        int index = str.indexOf(subStr);

        while (index >= 0) {
            count++;
            index = str.indexOf(subStr, index + subStr.length());
        }

        return count;
    }
}

