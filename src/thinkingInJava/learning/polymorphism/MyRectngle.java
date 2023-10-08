package thinkingInJava.learning.polymorphism;

public class MyRectngle extends GeometricObject {
    private double width;
    private double height;

    MyRectngle(double width,double height,String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    double fineArea() {
        return width * height;
    }
}
