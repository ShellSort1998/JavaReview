package thinkingInJava.learning;

public class LeftMove_and_RightMove {
    public static void main(String[] args) {
//        int i = -10;
//        int k = 10;
//        //-10 的二进制： 11111111111111111111111111110110
//        //第一位是1 即符号位，代表这是一个负数
//        System.out.println("-10的二进制数为： " + Integer.toBinaryString(i));
//
//        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
//        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1
//        int j = i >> 1;
//        int m = k >> 1;
//        System.out.println(j + " 和他的二进制 " + Integer.toBinaryString(j));
//        System.out.println(m + " 和他的二进制 " + Integer.toBinaryString(m));
//
//        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
//        //得到01111111111111111111111111111011，对应的十进制是2147483643
//        int n = i >>> 1;
//        System.out.println(Integer.toBinaryString(i) + " >>> 1 得： " + Integer.toBinaryString(n));
//        System.out.println(n);

        int i = 3;
        int j = 2;
        int m = i | j;
        System.out.println(m + "  " + Integer.toBinaryString(m));
        int n = i & j;
        System.out.println(n + "  " + Integer.toBinaryString(n));
        int k = m ^ n;
        System.out.println(k + "  " + Integer.toBinaryString(k));
        int l = (k << 2)>>>1 ;
        System.out.println(l + "  " + Integer.toBinaryString(l));
        int c = ((i | j) ^ (i & j)) << 2 >>> 1;
        System.out.println(c + "   " + Integer.toBinaryString(c));

    }
}
