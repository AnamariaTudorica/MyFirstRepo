package ro.scoalainformala.shapes.domain;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
        public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
        public double calculateArea() {
        return length * width;
    }
}
//new square