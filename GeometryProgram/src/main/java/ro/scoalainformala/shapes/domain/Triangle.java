package ro.scoalainformala.shapes.domain;

public class Triangle extends Shape {

    // proprietatile clasei (variabilele de instanta) - starea obiectului
    private double l1, l2, l3;

    // un constructor al clasei
    public Triangle(double l1, double l2, double l3) { //constructor
        setL1(l1);
        setL2(l2);
        setL3(l3);
    }

    // metodele publice ale clasei reprezinta "interfata" clasei

    // metoda de tip "getter"
    public double getL1() {
        return l1;
    }

    // metoda de tip "setter"
    public void setL1(double l1) {  // returns a void
        if (l1 > 0) { //Values of L2 and L3 are not relevant at this step
            // TODO trebuie sa validam valoarea pe care o setat
            this.l1 = l1;
        }
        else {
            System.out.println (l1 + " - x is an invalid value. Must be a positive value.");
        }
    }
    public void setL2(double l2) {  // returns a void
        if (l2 > 0) { //Values of L1 and L3 are not relevant at this step

            this.l2 = l2;
        }
        else {
            System.out.println (l2 + " - y is an invalid value. Must be a positive value.");
        }
    }
    public void setL3(double l3) {
    if (l3 > 0 && ((l2 + l3) >= l1) || (l1 + l3 >= l2) || (l2 + l1 >= l3)) {
        this.l3 = l3;
    }
        else {
        System.out.println (l3 + " - z is an invalid value. Please check if it forms a triangle");
    }
}

    // comportamentul obiectelor clasei
    public double calculatePerimeter() {
        return l1 + l2 + l3;
    }
    public double calculateArea() {
        return Math.sqrt(semiperimeter() * (semiperimeter() - l1) * (semiperimeter() - l2) * (semiperimeter() - l3));
    }

    // metodele private nu fac parte din interfata clasei

    // metoda accesibila doar in interiorul clasei curente
    private double semiperimeter() {
        return calculatePerimeter() / 2;
    }
}
