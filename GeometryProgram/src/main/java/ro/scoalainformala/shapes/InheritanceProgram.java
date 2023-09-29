package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.*;

public class InheritanceProgram {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(10),
                new Rectangle(3, 5),
                new Triangle(2, 4, 5),
                new Rectangle(3) // rectangle with one parameter, AKA (Also Known As) square.
        };


        for (Shape x : shapes) {
            System.out.println("The area of the shape is: " + x.calculateArea());
            System.out.println("The perimeter of the shape is: " + x.calculatePerimeter() + "\n");
        }
    }
}