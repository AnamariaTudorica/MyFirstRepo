package ro.scoalainformala;

/**
 Player
 ------
 - characteristics
 - name
 - strength
 - behaviors
 - kick
 */

public class Player { // o clasa este un tip de date (tip de date referinta)

    private String name;
    private int strength;

    // constructor
    public Player(String n, int s) {
        name = n;
        strength = s;
    }

    public void kick(Ball ball) {
        ball.move(strength);
    }

    public String getName() {
        return name;
    }
}
