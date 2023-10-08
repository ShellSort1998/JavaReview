package thinkingInJava.learning;

public class Variable_argument_list_Test {
    static void printArray(Object[] args) {
        for (Object ob : args) {
            System.out.print(ob + " , ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Float(0.3), new Character('b'), new Integer(339), new Long(123145)});
        printArray(new Object[]{new A(), new A(), new A(), new A()});
    }
}

class A {

}
