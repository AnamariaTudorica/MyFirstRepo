package ro.scoalainformala.domain;

public class Virus extends Organisms {
    double length;
    String name;
    String multiplier = "High";
    String treatment = "Vitamins"; //This will not change and is true for all Bacteria

    public Virus (String name, double length) {
        this.name = name;
        setLength(length);
    }

    @Override
    public String multiplicationRate (){
        return multiplier;
    }
    @Override
    public String treatmentProduct (){
        return treatment;
    }
    @Override
    public String getName (){
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
    private String Label(String name){
        String label = "LAB-VIRUS-";
        this.name = label+name;
        return this.name;
    }
    private void setLength (double length) { //encapsulation
        if(length < 20 || length > 500) {
            System.out.println("Invalid length for a virus!");
        }
        else {
            this.length = length;
        }
    }
}
