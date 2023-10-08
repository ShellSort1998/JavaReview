package thinkingInJava.learning;

public class ToBinaryDemo {
    public static void main(String[] args) {
//        String a = "aAbBcC";
//        byte[] bytes = a.getBytes();
//        for (byte b : bytes) {
//            System.out.print(b+" ");
//        }
//        System.out.println();
//
//        int b = 0xA;
//        System.out.println(Long.toBinaryString(b));

        int a = -10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a>>=10));
        System.out.println(Integer.toBinaryString(a>>>=10));

        System.out.println("======================");

        int b = 1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>=10));
        System.out.println(Integer.toBinaryString(b>>>=10));


    }
}
