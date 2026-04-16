import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class quiz1 {
	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("What robot world?");
		Display.openWorld("maps/" + filename + ".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);

		PictographTransformer karel = new PictographTransformer();
		karel.transform();
	}
}

class PictographTransformer extends Athlete {
	public PictographTransformer() {
		super(1, 1, Display.EAST, 0);
	}

	public void transform() {
		int[] heights = new int[4];

		for (int col = 0; col < 4; col++) {
			heights[col] = pickAndCountCurrentColumn();
			if (col < 3) {
				move();
			}
		}

		moveToWestWall();
		faceEast();

		for (int row = 0; row < 4; row++) {
			int length = heights[3 - row];
			buildRow(length);

			if (row < 3) {
				turnLeft();
				move();
				turnRight();
			}
		}
	}

	private int pickAndCountCurrentColumn() {
		int count = 0;
		faceNorth();

		while (nextToABeeper()) {
			pickBeeper();
			count++;

			if (frontIsClear()) {
				move();
			} else {
				break;
			}
		}

		faceSouth();
		while (frontIsClear()) {
			move();
		}
		faceEast();

		return count;
	}

	private void buildRow(int length) {
		int steps = 0;

		for (int i = 0; i < length; i++) {
			putBeeper();
			if (i < length - 1) {
				move();
				steps++;
			}
		}

		turnAround();
		for (int i = 0; i < steps; i++) {
			move();
		}
		turnAround();
	}

	private void moveToWestWall() {
		faceWest();
		while (frontIsClear()) {
			move();
		}
	}

	private void faceNorth() {
		while (!facingNorth()) {
			turnLeft();
		}
	}

	private void faceSouth() {
		while (!facingSouth()) {
			turnLeft();
		}
	}

	private void faceEast() {
		while (!facingEast()) {
			turnLeft();
		}
	}

	private void faceWest() {
		while (!facingWest()) {
			turnLeft();
		}
	}
}
