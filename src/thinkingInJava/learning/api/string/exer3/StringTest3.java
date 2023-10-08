package thinkingInJava.learning.api.string.exer3;

import java.util.*;

public class StringTest3 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        //初始化
        students[0] = new Student("wwx", "123");
        students[1] = new Student("mgg", "mgg123");
        students[2] = new Student("fqy", "fqy1991");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        System.out.println("*************登陆系统*************\n");
        System.out.print("用户名：");
        String userName = sc.next();
        System.out.print("密码： ");
        String psw = sc.next();
        boolean isFlag = true;
        for (int i = 0 ; i < students.length;i++) {
            if (students[i].getName().equals(userName)) {
                isFlag = false;
                if (psw.equals(students[i].getPsw())) {
                    System.out.println("登陆成功 " + students[i].getName());
                } else {
                    System.out.println("密码错误");
                }
                break;
            }
        }if (isFlag) {
            System.out.println("没有此用户");
        }

        sc.close();


    }
}
