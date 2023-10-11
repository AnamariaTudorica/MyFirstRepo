package ro.scoalainformala;
import java.util.Scanner;
import ro.scoalainformala.domain.*;

public class LabInheritance {

    public static void main(String[] args) {

        Organisms[] organisms = { //this array contains predefined objects
                new Virus("Adenovirus",29.5), //nm (interval 20-100)
                new Bacteria("E. Coli", 1200), //nm (interval 500-1500)
                new Parasite("Giardia" ,8400), //nm (interval 2000+)
        };

        for (Organisms org : organisms) { //for every object (org)  in the array we print the information

            System.out.println(org);
        }

        System.out.println("What type of organism do you want to introduce?");
        System.out.println("1 - Virus \n2 - Bacteria \n3 - Parasite");

        Scanner sc = new Scanner(System.in); //Scanner that allows user to choose his object
        int i = sc.nextInt();

        System.out.println ("Please insert the name of the organism:");
        String orgName = sc.next();

        System.out.println ("Please insert the length of the organism:");
        double length = sc.nextDouble();

        switch (i) { // Enhanced  switch that does not require break
            case 1 -> {
                Virus v = new Virus(orgName, length);
                System.out.println(v); // prints the overwritten toString from the specific object
            }
            case 2 -> {
                Bacteria b = new Bacteria(orgName, length);
                System.out.println(b);
            }
            case 3 -> {
                Parasite p = new Parasite(orgName, length);
                System.out.println(p);
            }
        }

    }
}