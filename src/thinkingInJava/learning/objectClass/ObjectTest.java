package thinkingInJava.learning.objectClass;

public class ObjectTest {
    public static void main(String[] args) {
        Person p1 = new Person("tom");
        Person p2 = new Person("tom");

        System.out.println("p1 == p2 ? "+ p1.equals(p2));     //false  调用Object类中的equals方法，判断两个对象是否相等

        String s1 = new String("Ho");
        String s2 = new String("Ho");
        String s3 = "Ho";
        String s4 = "Ho";

        System.out.println(s1 == s2);   //false 比较对象值
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s3.equals(s4));  //true
        System.out.println(s3 == s4);   //true 内存中new了一个“Ho”，s3,s4都指向这个字符串对象
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写了Object中的equals方法
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;    //强制类型转换
            return this.name.equals(p.name);
        }
        return false;
    }
}