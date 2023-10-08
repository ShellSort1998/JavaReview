package thinkingInJava.learning.api.stringMore;

import org.junit.Test;

public class StringMoreTest {
    /**
     * StringBuffer append()    字符串追加
     * StringBuffer delete(int start, int end)  删除[start,end)之间的字符
     * StringBuffer deleteCharAt(int index)     删除index位置的字符
     * StringBuffer replace(int start, int end, String str)     将[start,end)之间的字符替换为str
     * void setCharAt(int index, char c)    将index位置的字符设置为c
     * char charAt(int index)   获取index位置的字符
     * StringBuffer insert(int index, xx)   从index位置插入xx
     * int length()     获取字符串长度
     * StringBuffer reverse()   字符串反转
     */
    @Test
    public void stringBufferOrBuilderMethodTest1() {
        StringBuffer stringBuffer = new StringBuffer("StringString");
        System.out.println(stringBuffer.hashCode());
        //StringBuffer append()    字符串追加
        StringBuffer buffer = stringBuffer.append(53123412.1231);
        System.out.println(buffer);

        //StringBuffer delete(int start, int end)  删除[start,end)之间的字符
        StringBuffer delete = stringBuffer.delete(5, 10);
        System.out.println(delete);

        //StringBuffer deleteCharAt(int index)     删除index位置的字符
        StringBuffer stringBuffer1 = stringBuffer.deleteCharAt(12);
        System.out.println(stringBuffer1);

        //StringBuffer replace(int start, int end, String str)     将[start,end)之间的字符替换为str
        System.out.println(stringBuffer.replace(10, 15, "abc"));

        //void setCharAt(int index, char c)    将index位置的字符设置为c
        stringBuffer.setCharAt(9, '\u5788');
        System.out.println(stringBuffer);

        //StringBuffer insert(int index, xx)   从index位置插入xx
        StringBuffer n = stringBuffer.insert(15, "你号码");
        System.out.println(n);

        //reverse
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);

        System.out.println(reverse.hashCode());

        System.out.println(stringBuffer == stringBuffer1 && stringBuffer == reverse);


    }

    @Test
    public void stringBufferTest2() {

    }
}


