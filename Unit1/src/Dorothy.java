import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {
    public Dorothy() {
        super(2, 2, Display.EAST, 0);

    }

    public boolean findpath() {
        while (!nextToABeeper()) {
            turnAround();
            move();
            turnAround();
            turnLeft();
            move();
            if (nextToABeeper())
                break;
            else {
                turnAround();
                move();
            }
            move();
            if(nextToABeeper())
                break;
            else {
                return false;
            }
        }
        return true;
    }

    public void followpath() {
        while (nextToABeeper() && frontIsClear()) {
            move();

        }
    }
}
