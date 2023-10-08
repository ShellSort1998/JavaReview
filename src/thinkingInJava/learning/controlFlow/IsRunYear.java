package thinkingInJava.learning.controlFlow;

import java.util.Scanner;

/*
 *闰年：能被4整除，但不能被100整除 或 能被400整除
 */
public class IsRunYear {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入年份： ");
//        int year = sc.nextInt();
        IsRunYear years = new IsRunYear();
        //1998-3000年中闰年都有哪些
        for (int year = 1998; year <=3000 ; year++) {
            years.isRunYears(year);
        }
    }

    public void isRunYears(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " 为一个闰年。");
        } else {
            System.out.println(year + " 不是一个闰年。");
        }
    }
}
