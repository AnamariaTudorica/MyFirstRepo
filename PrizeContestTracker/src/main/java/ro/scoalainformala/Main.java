package ro.scoalainformala;

/*
    We're at a contest with prizes for children. Each prize is an object (toy or whatever) and children will choose
their prize. We want to have an application which accounts for all the available prizes and the taken prizes.
The "available prizes" inventory may contain several items of the same prize, but only one child is allowed to
choose a particular prize. Once a child has chosen a prize, the remaining children will have to choose any other prize.
    Please implement the necessary features so that the inventory is always up-to-date. At the same time, we need to
know which are the taken prizes (please use a set for this). 
    Implement a feature what will allow us to display the taken prizes.

 */

public class Main {
    static int nrChildren = 5;
    static  PrizeBox myPrizeBox = new PrizeBox();

    public static void main(String[] args) {

        Prize Prize1 = new Prize ("Car", 2);
        Prize Prize2 = new Prize("Doll",3);
        Prize Prize3 = new Prize("Train", 1);
        myPrizeBox.addToPrizeBox(Prize1);
        myPrizeBox.addToPrizeBox(Prize2);
        myPrizeBox.addToPrizeBox(Prize3);
        myPrizeBox.addToPrizeBox(new Prize("RC Car",1));

        System.out.println("Initial available prizes:");
        myPrizeBox.showAvailablePrizes();

        takePrize("Doll"); //A child takes a prize - Children left is updated in function
        takePrize("Doll");
        takePrize("Car");
        takePrize("Car");
        takePrize("RC Car");

        System.out.println("Updated available prizes:");
        myPrizeBox.showAvailablePrizes();

        System.out.println("Taken prizes (out of stock):");
        myPrizeBox.showTakenPrizes();
    }

    public static void takePrize(String prizeName) {
        if (nrChildren < 1) {
            System.out.println("No more children left without prize! <3");
            System.out.println("Taken prizes:");
            myPrizeBox.showTakenPrizes();
            System.exit(0);
        }
        else {
            for (Prize i : myPrizeBox.availablePrizes) {
                if(i.getName().equals(prizeName)) {
                    myPrizeBox.removeFromPrizeBox(i);
                    nrChildren--;
                    break;
                }
            }
        }
    }
}