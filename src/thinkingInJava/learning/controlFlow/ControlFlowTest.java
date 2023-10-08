package thinkingInJava.learning.controlFlow;

import java.util.Scanner;

public class ControlFlowTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("你的身高(m)：");
        float tall = sc.nextFloat();
        System.out.print("你的体重(kg)： ");
        float weight = sc.nextFloat();

        final float BMI = weight / (tall * tall);
        System.out.print("你的身体状态是： ");
        if (BMI == 0) {
            System.out.println("体重输入有误");
        } else if (BMI < 18.5) {
            System.out.println("体重过轻");
        } else if (BMI >= 18.5 && BMI < 24) {
            System.out.println("正常范围");
        } else if (BMI >= 24 && BMI < 27) {
            System.out.println("体重过重");
        } else if (BMI >= 27 && BMI < 30) {
            System.out.println("轻度肥胖");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("中度肥胖");
        } else {
            System.out.println("重度肥胖");
        }
    }
}
