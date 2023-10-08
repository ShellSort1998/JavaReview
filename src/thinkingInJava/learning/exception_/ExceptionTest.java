package thinkingInJava.learning.exception_;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        /*ERROR*/
        //StackOverflowError 栈溢出
//        main(args);
        //OutOfMemoryError 堆溢出
//        Byte[] bytes = new Byte[1024 * 1024 * 100];//100m

    }

    @Test
    public void exceptionTest1() {
        /*EXCEPTION*/

        //1.ArrayIndexOutOfBoundsException
        String[] strings = new String[10];
        System.out.println(strings[10]);
    }

    @Test
    public void exceptionTest2() {
        /*EXCEPTION*/

        //2.NullPointerException
        String[][] strings = new String[10][];
        System.out.println(strings[5][0]);
    }

    @Test
    public void exceptionTest3() {
        /*EXCEPTION*/

        //3.ClassCastException
        Object d = "2022";
        Date date = (Date) d;
        System.out.println(date);
    }

    @Test
    public void exceptionTest4() {
        /*EXCEPTION*/

        //4.NumberFormatException
        String i = "123";
        String j = "zbc";

        System.out.println(Integer.parseInt(i));
        System.out.println(Integer.parseInt(j));
    }

    @Test
    public void exceptionTest5() {
        /*EXCEPTION*/

        //5.InputMismatchException
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();
    }

    @Test
    public void exceptionTest6() {
        /*EXCEPTION*/

        //5.ArithmeticException
        int a = 10 / 0;
        System.out.println(a);
    }

    public void throws_test() throws NullPointerException, IOException {
        File file = new File("src/thinkingInJava/learning/exception_/test.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }

    @Test
    public void throwsAndThrowTest() throws IOException {
        throws_test();

        throw new RuntimeException("你好吗，运行期异常");
//        System.out.println("throw 后面的代码会编译不通过")
    }

    @Test
    public void testException() throws BelowZero {
        int a = 9;
        if (a < 0) {
            System.out.println(a);
        } else {
            throw new BelowZero("大于0");
        }
    }
}
