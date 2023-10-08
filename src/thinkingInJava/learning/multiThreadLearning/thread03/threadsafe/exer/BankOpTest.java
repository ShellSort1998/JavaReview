package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.exer;

public class BankOpTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Person p1 = new Person(bankAccount, "p1");
        Person p2 = new Person(bankAccount, "p2");

        p1.start();
        p2.start();
    }
}

class BankAccount {
    private double balance; //余额

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void in(double money) {
        if (money > 0) {
            balance += money;
        }
        showBalance();
    }

    public void showBalance() {
        System.out.println(Thread.currentThread().getName() + "进行时的余额为：" + balance);
    }
}


class Person extends Thread {
    BankAccount bankAccount;


    public Person(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Person(BankAccount bankAccount, String name) {
        super(name);
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        cun();
    }

    public void cun() {
        //m每人村三次
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bankAccount.in(1000.0);
        }

    }
}