package thinkingInJava.learning.api.string.exer2;

public class StringTest2 {
    public static void main(String[] args) {
        // 字符串反转
        String s = "abcdefg";
        String reverse = reverseAll(s);
        System.out.println(reverse);

        String s1 = reverseOf(s, 2, 5);
        System.out.println(s1);

        String s2 = reverseOf2(s, 2, 5);
        System.out.println(s2);
    }

    //整体字符串反转
    public static String reverseAll(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }

//        System.out.println(result);
        return result;
    }

    //指定位置字符串反转 方式1
    public static String reverseOf(String str, int fromIndex, int endIndex) {
        if (endIndex < fromIndex)
            throw new IllegalArgumentException("前后索引不匹配");
        else if (endIndex > str.length() || fromIndex < 0)
            throw new ArrayIndexOutOfBoundsException("数组下标越界");

        char[] chars = str.toCharArray();
        //String s = "abcdefg";
        //****
        for (int i = endIndex, j = fromIndex; i > j; i--, j++) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    //方式2
    public static String reverseOf2(String str, int fromIndex, int endIndex) {
        if (endIndex < fromIndex)
            throw new IllegalArgumentException("前后索引不匹配");
        else if (endIndex > str.length() || fromIndex < 0)
            throw new ArrayIndexOutOfBoundsException("数组下标越界");

        String prefix = str.substring(0, fromIndex);
        String suffix = str.substring(endIndex + 1, str.length());

        String middle = "";

        for (int i = endIndex; i >= fromIndex; i--) {
            middle += str.charAt(i);
        }
        return prefix + middle + suffix;
    }
}
