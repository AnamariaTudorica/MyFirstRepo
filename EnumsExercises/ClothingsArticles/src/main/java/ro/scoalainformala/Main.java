package ro.scoalainformala;
/*
    -model the articles in a clothing store (allow only a finite set of sizes)
 */

public class Main {
    public static void main(String[] args) {
        Size T_shirt = Size.XL;
        System.out.println("The size of the T-shirt is: " + T_shirt);

        System.out.println("Available sizes for articles:");

        for (Size article : Size.values()) {
            System.out.print(article + "  ");
        }
    }
}