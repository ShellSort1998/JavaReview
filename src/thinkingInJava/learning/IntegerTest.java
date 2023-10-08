package thinkingInJava.learning;

public class IntegerTest {
    public static void main(String[] args) {
        Integer in1 = new Integer(10);
        Integer in2 = new Integer(10);
        System.out.println(in1 == in2);
        System.out.println(in1.equals(in2));

        System.out.println("=========================");

        int in3 = 130;
        Integer in4 = new Integer(130);
        System.out.println(in3 == in4);
        System.out.println(in4.equals(in3));
    }
}
