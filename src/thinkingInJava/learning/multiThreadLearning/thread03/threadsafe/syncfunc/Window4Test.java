package thinkingInJava.learning.multiThreadLearning.thread03.threadsafe.syncfunc;

public class Window4Test {
    public static void main(String[] args) {
        SaleTicketsByExtend s1 = new SaleTicketsByExtend();
        SaleTicketsByExtend s2 = new SaleTicketsByExtend();
        SaleTicketsByExtend s3 = new SaleTicketsByExtend();

        s1.setName("����1");
        s2.setName("����2");
        s3.setName("����3");


        s1.start();
        s2.start();
        s3.start();
    }
}

class SaleTicketsByExtend extends Thread {
    static int ticket = 100;
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
//            show();   //�Ǿ�̬��ͬ������
            showByStatic();     //��̬ͬ������
        }
    }

    /**
     * ���ڼ̳е�ͬ������
     */
    public synchronized void show() {   //���ڼ̳�ʵ�ֶ��̣߳����е�ͬ����������Ϊ��̬�ģ���Ϊ�Ǿ�̬����ζ�ţ���ʱ��ͬ��������Ϊ this������new������������this��һ�£��������²���һ��ͬ���������������̰߳�ȫ����
        if (ticket > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "����, " + "Ʊ��Ϊ�� " + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }

    /**
     * ���ڼ̳еľ�̬ͬ������
     */
    public static synchronized void showByStatic() {
        if (ticket > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "����, " + "Ʊ��Ϊ�� " + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
