package thinkingInJava.learning;

public class KongZhiZhiXingLiuCheng {
    public static void main(String[] args) {
//        for (char c = 0; c < 128; c++) {
//            System.out.println((int) c + " is : " + c);
//        }
        int i;
        for (i = 0; i < 20; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }
        System.out.println(i);
    }
}
