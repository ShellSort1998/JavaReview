package thinkingInJava.temp;
import java.util.*;

/**
 * @author wwx
 */
public class Lesson01 {
    public static void main(String[] args) {
        Date nowTime = new Date();
        System.out.println(nowTime);

//        showProperties
//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("java.library.path"));


        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
    }
}
