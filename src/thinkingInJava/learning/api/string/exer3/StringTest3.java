package thinkingInJava.learning.api.string.exer3;

import java.util.*;

public class StringTest3 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        //��ʼ��
        students[0] = new Student("wwx", "123");
        students[1] = new Student("mgg", "mgg123");
        students[2] = new Student("fqy", "fqy1991");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        System.out.println("*************��½ϵͳ*************\n");
        System.out.print("�û�����");
        String userName = sc.next();
        System.out.print("���룺 ");
        String psw = sc.next();
        boolean isFlag = true;
        for (int i = 0 ; i < students.length;i++) {
            if (students[i].getName().equals(userName)) {
                isFlag = false;
                if (psw.equals(students[i].getPsw())) {
                    System.out.println("��½�ɹ� " + students[i].getName());
                } else {
                    System.out.println("�������");
                }
                break;
            }
        }if (isFlag) {
            System.out.println("û�д��û�");
        }

        sc.close();


    }
}
