package thinkingInJava.learning;

import java.util.HashMap;
import java.util.Map;

public enum EnumTest {
    FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH
}

class Test {
    public static void main(String[] args) {
        EnumTest enums = EnumTest.FIRST;
        System.out.println(enums);

        System.out.println("===================");

        //values()方法为所有值
        for (EnumTest enumss : EnumTest.values()) {
            //ordinal() 方法反映了枚举元素的声明顺序
            System.out.println(enumss + " " + enumss.ordinal());


        }
    }
}
