import edu.fcps.karel2.Display;

public class Dancer2 extends Dancer {
    public Dancer2(int x, int y, int dir, int beep) {
        super(x, y, dir, beep);
    }

    public Dancer2() {
        super(1, 1, Display.EAST, 0);
    }

    @Override
    public void danceStep() {
        while (true) {
            turnLeft();
            move();
            turnRight();
            move();
            turnRight();
            move();
            turnLeft();
        }

    }

}
