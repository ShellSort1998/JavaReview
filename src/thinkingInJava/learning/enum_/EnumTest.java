package thinkingInJava.learning.enum_;

public class EnumTest {
    public static void main(String[] args) {
        Seasons spring = Seasons.SPRING;
        System.out.println(spring.getSeasonName()+"--"+spring.getDescription());

        for (Seasons value : Seasons.values()) {
            System.out.println(value.toString());
        }

        int ordinal = B.A.ordinal();
        System.out.println(ordinal);


    }
}

enum Seasons{

    SPRING("��", "��ů����"),
    SUMMER("��", "��������"),
    AUTUMN("��", "�����ˬ"),
    WINTER("��", "��ѩ����");

    //˽�л�����
    private final String seasonName;
    private final String description;

    Seasons(String seasonName, String description) {
        this.seasonName = seasonName;
        this.description = description;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "{ "+seasonName+" , "+description+" }";
    }
}

enum B {
    A,B,C, D,E;
}