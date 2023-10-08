package thinkingInJava.learning.polymorphism;

public class Circle extends GeometricObject {

    private double radius;

    Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    double fineArea() {
        return 3.14 * radius;
    }
}
