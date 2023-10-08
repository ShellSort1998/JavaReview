package thinkingInJava.learning.exception_;

import org.junit.Test;

public class SelfExcptionClassTest extends Exception {
    public SelfExcptionClassTest() {
        super();
    }
    public SelfExcptionClassTest(String name) {
        super(name);
    }
}

class T {
    @Test
    public void test() throws SelfExcptionClassTest {

        throw new SelfExcptionClassTest();
    }
}