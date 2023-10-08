package thinkingInJava.learning.multiThreadLearning.thread05.communication.exer;

public class ProductorAndCustomerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);
        Customer customer = new Customer(clerk);

        Thread pro1 = new Thread(producer, "������1");
        Thread con1 = new Thread(customer, "������1");
        Thread con2 = new Thread(customer, "������2");

        pro1.start();
        con1.start();
        con2.start();
    }
}
