package thinkingInJava.learning.controlFlow;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入月份： ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 4:
                System.out.println("spring");
                break;
            case 5:
                System.out.println("spring");
                break;
            case 6:
                System.out.println("summer");
                break;
            case 7:
                System.out.println("summer");
                break;
            case 8:
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            case 10:
                System.out.println("autumn");
                break;
            case 11:
                System.out.println("autumn");
                break;
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("procedure over");
        }
    }
}
