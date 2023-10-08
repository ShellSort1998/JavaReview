package thinkingInJava.learning.exception_.exer;

public class Person {
    private String name;
    private Integer lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(Integer lifeValue) {
        if (lifeValue < 0)
            throw new NoLifeValueException("生命值不能为负数" + lifeValue);
        this.lifeValue = lifeValue;
    }

    public Person() {
    }

    public Person(String name, Integer lifeValue) {
        this.name = name;
        setLifeValue(lifeValue);
    }
}
