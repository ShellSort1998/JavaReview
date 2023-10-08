package thinkingInJava.learning.exception_.exer;

public class Exer1 {
    public static void main(String[] args) {
//        Person io = new Person("IO", -5);

        Person pa = new Person();
        pa.setName("pa");
        pa.setLifeValue(100);
        pa.setLifeValue(-100);
        System.out.println(pa.getName() + " _ " + pa.getLifeValue());
    }
}
