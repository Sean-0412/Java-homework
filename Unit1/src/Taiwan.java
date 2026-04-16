import edu.fcps.karel2.Display;

public class Taiwan {
	public static void main(String[] args) {
		Display.setSize(16, 12);
		Display.setSpeed(20);

		// Draw the field of the flag.
		fillRectangle(2, 2, 12, 8, 1);

		// Add one more beeper per corner in the canton to represent blue.
		fillRectangle(2, 6, 6, 4, 1);

		// Add one more beeper to mark the white sun inside the canton.
		putExtra(4, 8);
		putExtra(4, 9);
		putExtra(4, 7);
		putExtra(3, 8);
		putExtra(5, 8);
		putExtra(3, 9);
		putExtra(5, 9);
		putExtra(3, 7);
		putExtra(5, 7);
	}

	private static void fillRectangle(int startX, int startY, int width, int height, int beepersPerCorner) {
		Athlete painter = new Athlete(startX, startY, Display.EAST, Display.INFINITY);

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				for (int i = 0; i < beepersPerCorner; i++) {
					painter.putBeeper();
				}

				if (col < width - 1) {
					painter.move();
				}
			}

			if (row < height - 1) {
				if (painter.facingEast()) {
					painter.turnLeft();
					painter.move();
					painter.turnLeft();
				} else {
					painter.turnRight();
					painter.move();
					painter.turnRight();
				}
			}
		}
	}

	private static void putExtra(int x, int y) {
		Athlete painter = new Athlete(x, y, Display.NORTH, Display.INFINITY);
		painter.putBeeper();
	}
}
