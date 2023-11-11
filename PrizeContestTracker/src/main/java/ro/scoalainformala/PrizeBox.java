package ro.scoalainformala;

import java.util.*;

public class PrizeBox {
    ArrayList <Prize> availablePrizes;

    Set<Prize> takenPrizes = new HashSet<>();
    PrizeBox(){
        this.availablePrizes = new ArrayList<>();
    }
    public void addToPrizeBox(Prize prize) {
        this.availablePrizes.add(prize);
    }
    public void removeFromPrizeBox(Prize item) {
        for (Prize myPrize : availablePrizes) {
            if (myPrize.getName().equals(item.getName())) {
                if (item.getQuantity() - 1 >= 0) {
                    item.setQuantity(item.getQuantity() - 1);
                }
                if (item.getQuantity() < 1) {
                    this.availablePrizes.remove(item);
                    takenPrizes.add(myPrize);
                }
                break;
            }
        }
    }

    public void showAvailablePrizes(){
        for (Prize a : availablePrizes) {
            System.out.print(a.getName() + ": " + a.getQuantity() + "; " );
        }
        System.out.println();
    }
    public void showTakenPrizes(){
        for (Prize t : takenPrizes) {
            System.out.print(t.getName() + "; " );
        }
        System.out.println();
    }
}
