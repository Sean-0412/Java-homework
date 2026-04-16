import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Racer extends Athlete {

    public Racer(int x) {
        super(1, x, Display.EAST, 0);
    }

    public void jumpRight() {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }

    public void jumpLeft() {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }

    public void sprint(int n) {
        for (int i = 0; i < n; i++) {
            move();
        }
    }

    public void put(int n) {
        for (int i = 0; i < n; i++) {
            putBeeper();
        }
    }

    public void pick(int n) {
        for (int i = 0; i < n; i++) {
            pickBeeper();
        }
    }

}