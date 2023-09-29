package ro.scoalainformala.shapes.domain;

public class Circle extends Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

   @Override
        public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
        public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
