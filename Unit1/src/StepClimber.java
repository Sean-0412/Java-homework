public class StepClimber extends Climber {
    public StepClimber(int x) {
        super(x);
    }

    @Override
    public void climbUpLeft() {
        turnRight();
        move();
        turnLeft();
        move();
    }

    @Override
    public void climbDownRight() {
        move();
        turnRight();
        move();
        turnLeft();
    }

    @Override
    public void climbUpRight() {
        turnLeft();
        move();
        turnRight();
        move();
    }

    @Override
    public void climbDownLeft() {
        move();
        turnLeft();
        move();
        turnRight();
    }
}
