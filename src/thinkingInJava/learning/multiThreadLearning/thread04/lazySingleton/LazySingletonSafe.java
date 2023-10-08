package thinkingInJava.learning.multiThreadLearning.thread04.lazySingleton;

public class LazySingletonSafe {
    static LazySingleton l1 = null;
    static LazySingleton l2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                l1 = LazySingleton.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                l2 = LazySingleton.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
    }
}

class LazySingleton implements Runnable {
    private LazySingleton() {

    }

    private static volatile LazySingleton lazySingleton = null;

//    public static LazySingleton getInstance() { //有线程安全问题
//        if (lazySingleton == null) {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

//    public static synchronized LazySingleton getInstance() { //使用同步方法使得线程安全 由于是静态同步方法，所以它的同步监视器为当前类本身，即LazySingleton.class
//        if (lazySingleton == null) {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    public static LazySingleton getInstance() { //使用同步方法使得线程安全 由于是静态同步方法，所以它的同步监视器为当前类本身，即LazySingleton.class
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }
    }

    @Override
    public void run() {
        getInstance();
    }
}
