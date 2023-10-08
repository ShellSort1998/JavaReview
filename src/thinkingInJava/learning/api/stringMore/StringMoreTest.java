package thinkingInJava.learning.api.stringMore;

import org.junit.Test;

public class StringMoreTest {
    /**
     * StringBuffer append()    �ַ���׷��
     * StringBuffer delete(int start, int end)  ɾ��[start,end)֮����ַ�
     * StringBuffer deleteCharAt(int index)     ɾ��indexλ�õ��ַ�
     * StringBuffer replace(int start, int end, String str)     ��[start,end)֮����ַ��滻Ϊstr
     * void setCharAt(int index, char c)    ��indexλ�õ��ַ�����Ϊc
     * char charAt(int index)   ��ȡindexλ�õ��ַ�
     * StringBuffer insert(int index, xx)   ��indexλ�ò���xx
     * int length()     ��ȡ�ַ�������
     * StringBuffer reverse()   �ַ�����ת
     */
    @Test
    public void stringBufferOrBuilderMethodTest1() {
        StringBuffer stringBuffer = new StringBuffer("StringString");
        System.out.println(stringBuffer.hashCode());
        //StringBuffer append()    �ַ���׷��
        StringBuffer buffer = stringBuffer.append(53123412.1231);
        System.out.println(buffer);

        //StringBuffer delete(int start, int end)  ɾ��[start,end)֮����ַ�
        StringBuffer delete = stringBuffer.delete(5, 10);
        System.out.println(delete);

        //StringBuffer deleteCharAt(int index)     ɾ��indexλ�õ��ַ�
        StringBuffer stringBuffer1 = stringBuffer.deleteCharAt(12);
        System.out.println(stringBuffer1);

        //StringBuffer replace(int start, int end, String str)     ��[start,end)֮����ַ��滻Ϊstr
        System.out.println(stringBuffer.replace(10, 15, "abc"));

        //void setCharAt(int index, char c)    ��indexλ�õ��ַ�����Ϊc
        stringBuffer.setCharAt(9, '\u5788');
        System.out.println(stringBuffer);

        //StringBuffer insert(int index, xx)   ��indexλ�ò���xx
        StringBuffer n = stringBuffer.insert(15, "�����");
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


