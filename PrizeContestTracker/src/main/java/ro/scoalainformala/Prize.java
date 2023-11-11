package ro.scoalainformala;

/*
OOD: Proprieties:instance variables:  - available prizes : toys -items of same prize, and one particular prize
                                     - taken prizes (inventory is always up-to-date)
                                     - children
     Behaviour: Methods : prizes - ability to be added or removed from the PrizeBox
                          children - ability to pick the prize from the PrizeBox
 */
public class Prize {
    String name;
    int quantity;
    public Prize(String name, int quantity) {
        this.name=name;
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
