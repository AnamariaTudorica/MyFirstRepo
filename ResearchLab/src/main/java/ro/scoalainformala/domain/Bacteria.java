package ro.scoalainformala.domain;
public class Bacteria extends Organisms {
    double length;
    String name;
    String multiplier = "Medium"; //private if not stated otherwise (encapsulation)
    String treatment = "Antibiotics"; //This will not change and is true for all Bacteria

    public Bacteria (String name, double length) {
        this.name = name;
        setLength(length);
    }

    @Override
    public String multiplicationRate (){
        return multiplier.toString();
    }
    @Override
    public String treatmentProduct () {
        return treatment;
    }
    @Override
    public String getName () {
        return Label(name);
    }
    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Multiplication rate of " + getName() +": " + multiplicationRate() + "\n" + "Length of the organism is: " + getLength() + "\n" + "Treatment product is: " + treatmentProduct() + "\n";
    }
    private String Label (String name) {
        String label = "LAB-BACTERIA-";
        this.name = label+name;
        return this.name;
    }
    private void setLength (double length) {
        if(length < 500 || length > 1500) {
            System.out.println("Invalid length for a bacteria!");
        }
        else {
            this.length = length;
        }
    }
}
