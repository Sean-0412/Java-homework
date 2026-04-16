import edu.fcps.karel2.Display;

public class Dancer3 extends Dancer {
    public Dancer3(int x, int y, int dir, int beep) {
        super(x, y, dir, beep);
    }

    public Dancer3() {
        super(1, 1, Display.EAST, 0);
    }

    @Override
    public void danceStep() {
        while (true) {
            turnLeft();
            move();
            move();
            turnRight();
            move();
            turnLeft();
        }
    }
}
