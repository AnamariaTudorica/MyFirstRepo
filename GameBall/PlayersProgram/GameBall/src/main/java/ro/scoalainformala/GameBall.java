package ro.scoalainformala;

public class GameBall {

    public static void main(String[] args) {

        Player p = new Player("Andrew", 8);

        Ball aBall = new Ball("A", 5);

        Ball bBall = new Ball("B", 3);

        p.kick(aBall);
        p.kick(bBall);
        p.kick(bBall);

        System.out.println("Player " + p.getName() + " has kicked the ball " + aBall.getName()
                + " and it is now on position " + aBall.getPosition());

        System.out.println("Player " + p.getName() + " has kicked the ball " + bBall.getName()
                + " and it is now on position " + bBall.getPosition());
    }
}
