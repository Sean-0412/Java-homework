import edu.fcps.karel2.Display;

public class quiz4 {
	public static void main(String[] args) {
		Display.openWorld("maps/maze2.map");
		Display.setSize(8, 8);
		Display.setSpeed(5);

		TraceDemocrat karel = new TraceDemocrat();
		runMaze(karel);
		karel.printSummary();
	}

	private static void runMaze(MazeEscaper arg) {
		arg.walkDownCurrentSegment();
		while (!arg.nextToABeeper()) {
			arg.turnToTheNextSegment();
			arg.walkDownCurrentSegment();
		}
	}
}

class TraceDemocrat extends MazeEscaper {
	private int stepCount = 0;
	private int turnCount = 0;

	private int x = 1;
	private int y = 6;
	private int dir = 2; // 0:N, 1:E, 2:S, 3:W

	public TraceDemocrat() {
		super(1, 6, Display.SOUTH, 0);
	}

	@Override
	public void walkDownCurrentSegment() {
		while (!leftIsClear() && frontIsClear() && !nextToABeeper()) {
			move();
		}
	}

	@Override
	public void turnToTheNextSegment() {
		turnCount++;
		System.out.println("turn " + turnCount + " at (" + x + ", " + y + ")");

		if (leftIsClear()) {
			turnLeftTracked();
			move();
		} else {
			turnRightTracked();
		}
	}

	@Override
	public void move() {
		super.move();
		stepCount++;
		updatePositionAfterMove();
		System.out.println("step " + stepCount + " -> (" + x + ", " + y + ")");
	}

	public void printSummary() {
		System.out.println("stepCount total = " + stepCount);
		System.out.println("turnCount total = " + turnCount);
	}

	private void turnLeftTracked() {
		super.turnLeft();
		dir = (dir + 3) % 4;
	}

	private void turnRightTracked() {
		super.turnLeft();
		super.turnLeft();
		super.turnLeft();
		dir = (dir + 1) % 4;
	}

	private void updatePositionAfterMove() {
		if (dir == 0) {
			y++;
		} else if (dir == 1) {
			x++;
		} else if (dir == 2) {
			y--;
		} else {
			x--;
		}
	}
}
