package ro.scoalainformala;

/**
 Ball
 ----
 - characteristics (properties)
 - name
 - position
 - distance
 - behaviors (actions; methods)
 - move
 - getPosition
 */

public class Ball {

    // proprietatile si metodele astea le numim "de instanta"

    // properties (instance variables)

    // state (starea obiectului)
    private String name;
    private int position;

    // constructor
    public Ball(String n, int pos) {
        name = n;
        position = pos;
    }

    // methods (instance methods)

    // API-ul clasei Ball -> setul de metode pe care clasa il expune
    public int getPosition() {
        return position;
    }

    public void move(int playerStrength) {
        position = position + playerStrength;
    }

    public String getName() {
        return name;
    }
}
