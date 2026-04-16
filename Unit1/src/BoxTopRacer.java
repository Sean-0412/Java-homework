public class BoxTopRacer extends Racer {
    public BoxTopRacer(int x) {
        super(x);
    }

    @Override
    public void jumpRight() {
        turnLeft();
        while (!rightIsClear()) {
            move();
        }
        turnRight();
        do {
            move();
        } while (!rightIsClear());
        turnRight();
        move();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }
    
}
