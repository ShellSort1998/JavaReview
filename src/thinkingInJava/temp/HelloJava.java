package thinkingInJava.temp;

import java.util.*;
class HelloJava{
    private String userName;
    public HelloJava(String name){
        userName = name;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入名称：");
        String nameInput = sc.next();

        HelloJava h1 = new HelloJava(nameInput);

        System.out.println("hello java , my name is " + h1.userName);
    }
}