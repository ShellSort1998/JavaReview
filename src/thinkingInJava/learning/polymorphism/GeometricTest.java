package thinkingInJava.learning.polymorphism;

public class GeometricTest {
    void equalArea(GeometricObject circle, GeometricObject myRectngle) {
        double circleArea = circle.fineArea();
        double myRectngleArea = myRectngle.fineArea();


        if (circleArea == myRectngleArea) {
            System.out.println("面积相等");
        } else {
            System.out.println("面积不等");
        }

    }

    void displayGeometricObject(GeometricObject geometricObject) {
        System.out.println("几何图形面积 ：" + geometricObject.fineArea());
    }

    public static void main(String[] args) {
        GeometricObject circle = new Circle("white", 1, 3);
        GeometricObject rectngle = new MyRectngle(4, 5, "black", 1);

        GeometricTest geometricTest = new GeometricTest();
        geometricTest.displayGeometricObject(circle);
        geometricTest.displayGeometricObject(rectngle);

        geometricTest.equalArea(circle, rectngle);
    }
}
