package thinkingInJava.learning.singleTon;

public class SingleTonTest {

    public static void main(String[] args) {

    }
}

//饿汉式：
class Bank {
    // 私有构造器
    private Bank() {

    }
    //私有创建对象
    private static Bank instanceBank = new Bank();
    //调用实例
    public static Bank getInstanceBank() {
        return instanceBank;
    }
}

//懒汉式
class GirlFriend {
    //私有化构造器
    private GirlFriend() {

    }
    //声明当前类实例
    private static GirlFriend instanceGirl = null;
    //通过getXxx()获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static GirlFriend getInstance() {
        if (instanceGirl == null) {
            instanceGirl =  new GirlFriend();
        }
        return instanceGirl;
    }
}
