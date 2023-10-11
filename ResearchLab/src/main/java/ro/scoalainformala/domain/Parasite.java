package ro.scoalainformala.domain;

public class Parasite extends Organisms { //proprieties + instance variables , Class extends the mother class
    double length; //instance variable (will be used later in constructor as parameter)
    String name; //instance variable  (will be used later in constructor as parameter)
    String multiplier = "Low"; //propriety of Parasite class
    String treatment = "Antiparasitic"; //propriety , Proprieties  are true and will not change for all Parasites

    public Parasite (String name, double length) { //constructor
        this.name = name; // both instructions  will be called when the object will be created
        setLength(length);
    }

    @Override
    public String multiplicationRate () { //this  4 methods are overwritten  from the mother class Organisms
        return multiplier;
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
    public String toString() { //method is overwritten from Object- Java lang toString()
        return "Multiplication rate of " + getName() +": " + multiplicationRate() + "\n" + "Length of the organism is: " + getLength() + "\n" + "Treatment product is: " + treatmentProduct() + "\n";
    }
    private String Label(String name) { //encapsulation for Parasite's Label
        String label = "LAB-PARASITE-";
        this.name = label+name;
        return this.name;
    }
    private void setLength (double length) { //encapsulation for  parasite's length and validation of length
        if(length < 2000) {
            System.out.println("Invalid length for a parasite!");
        }
        else {
            this.length = length;
        }
    }
}
