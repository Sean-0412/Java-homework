import edu.fcps.karel2.Display;

public class Dancer1 extends Dancer {
    public Dancer1(int x, int y, int dir, int beep) {
        super(x, y, dir, beep);
    }

    public Dancer1() {
        super(1, 1, Display.EAST, 0);
    }

    @Override
    public void danceStep() {
        while (true) {
            move();
            turnRight();
            turnRight();
            move();
            turnLeft();
        }

    }

}
