package thinkingInJava.learning.api.string.exer3;

public class Student {
    private String name;
    private String psw;

    public Student() {

    }

    public Student(String name, String psw) {
        this.name = name;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
