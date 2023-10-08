package LessionOne;

import java.util.Locale;
import java.util.Scanner;

public class Test1 {
    //负数 二进制存法：其绝对值的二进制数，按位取反，再加1
    //如：
    // -8       0000 1000
    // 按位取反:  1111 0111
    // 再加1  :  1111 1000    即表示为-8
    // -3       0000 0011
    // 按位取反:  1111 1100
    // 再加1  :  1111 1101    即表示为-3

    static String str = "The least entrepreneurial generation";
    static int jige = 0;
    static int youxiu = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int pn = scan.nextInt();
        int[] score = new int[pn];
        for (int i = 0; i < score.length; i++) {
            score[i] = scan.nextInt();
        }
        for (int sc : score) {
            if (sc >= 60)
                jige++;
            if (sc >= 85)
                youxiu++;
        }
//        System.out.printf("pn = %d , jige = %d , youxiu = %d%n", pn,jige,youxiu);
        System.out.println(Math.round(((float) jige / pn)*100) + "%");
        System.out.println(Math.round(((float) youxiu / pn)*100) + "%");

        scan.close();
    }
}


