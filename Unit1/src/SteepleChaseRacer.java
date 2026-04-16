public class SteepleChaseRacer extends Racer {
    public SteepleChaseRacer(int x) {
        super(x);
    }

    @Override
    public void jumpRight() {
        turnLeft();
        while (!rightIsClear()) {
            move();
        }
        turnRight();
        move();
        turnRight();
        move();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }
    
}
