package thinkingInJava.learning.polymorphism;

import java.lang.Object;
public class GeometricObject {
    private String color;
    private double weight;

    GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    double fineArea() {
        return 0.0;
    }
}
