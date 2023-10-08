package thinkingInJava.learning.multiThreadLearning.thread05.communication;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count += i;
            }
        }
        return count;
    }
}

class CallableFunTest {
    public static void main(String[] args) {
        CallableTest callableTest = new CallableTest();

        FutureTask futureTask = new FutureTask(callableTest);

        Thread thread = new Thread(futureTask);

        thread.start();

        try {
            Object o = futureTask.get();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}