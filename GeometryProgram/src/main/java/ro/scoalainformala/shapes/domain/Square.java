package ro.scoalainformala.shapes.domain;

public class Square extends Rectangle {
    //Square mosteneste clasa Rectangle (inherits) =>
    //principiul mostenirii (Inheritance)
    // Square are o relatie de tip "is-a" cu Rectangle
    //Rectangle este un supertip al tipului Square
    //Square este copil al clasei Rectangle
    //Rectangle este parinte al clasei Square
    //clasa Square este o specializare a clasei rectangle
    double length;  //properties of the object - instance variable

    public Square(double length) { //constructor (with parameter without returned type)

        super(length, length);
    }

    @Override
    public double calculatePerimeter() { // Behaviour (method without  parameters and with returned type)
        return length * 4;
    }

    @Override
    public double calculateArea() { // Behaviour (method)
        return length * length;
    }
}
// Square s = new Square(5) sau Rectangle r = new Square (5) (relatia un Square este un rectangle)
//s.calculateArea()