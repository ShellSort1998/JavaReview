package thinkingInJava.learning.block;

public class BlockTest {
    public BlockTest() {
        System.out.println("构造器");
    }
    static {
        System.out.println("静态代码块");
        String[] s = {"A", "B", "C", "D"};
        BlockTest.main(s);
    }
    {
        System.out.println("非静态代码块");
    }

    public static void main(String[] args) {
        BlockTest blockTest = new BlockTest();
    }
}
