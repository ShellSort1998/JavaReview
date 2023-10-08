package thinkingInJava.learning.exception_;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {
    @Test
    public void try_catch_test() {
        try {
            String[][] strings = new String[10][];
            System.out.println(strings[5][0]);
        } catch (InputMismatchException e) {
            System.out.println("���� InputMismatchException �쳣 ");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("���� NullPointerException -- message: [ " + e.getMessage() + " ]");
        } finally {
            System.out.println("finally");
        }
        System.out.println("try_catch end");
    }
}
