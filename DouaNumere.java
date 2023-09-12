package douaNumere;

import java.util.*;


public class DouaNumere {
    static int max(int a, int b) {

        System.out.println("The maximum value from the a and b is: " + (Math.max(a, b)));

        return Math.max(a,b);

    }
    static int cmdc(int a,int b) {
        while (a != b)
            if (a>b){
                a-=b;
            }

            else {
                b-=a;
            }
            return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the value of a:");
        int a = sc.nextInt();
        System.out.println("Please insert the value of b:");
        int b = sc.nextInt();

        System.out.println("The maximum number is:" +  Math.max(a, b));
        System.out.println ("The Cmdc for a and b is:" + cmdc(a,b));

    }
}
