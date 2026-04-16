import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class gogoman extends Athlete {
	private static final int EXIT_BEEPERS = 1;
	private static final int VISITED_BEEPERS = 2;

	public gogoman() {
		super(1, 1, Display.NORTH, Display.INFINITY);
	}

	public void solveMaze() {
		if (nextToABeeper()) {
			return;
		}
		searchWithBacktracking();
	}

	private boolean searchWithBacktracking() {
		int beeperCount = countBeepersHere();

		if (beeperCount == EXIT_BEEPERS) {
			return true;
		}

		if (beeperCount >= VISITED_BEEPERS) {
			return false;
		}

		// Mark this cell as visited using 2 beepers.
		putBeeper();
		putBeeper();

		for (int i = 0; i < 4; i++) {
			if (frontIsClear()) {
				move();

				if (searchWithBacktracking()) {
					return true;
				}

				moveBack();
			}
			turnRight();
		}

		// Dead end: remove visit marker before returning to previous junction.
		pickBeeper();
		pickBeeper();
		return false;
	}

	private int countBeepersHere() {
		int count = 0;

		while (nextToABeeper()) {
			pickBeeper();
			count++;
		}

		for (int i = 0; i < count; i++) {
			putBeeper();
		}

		return count;
	}

	private void moveBack() {
		turnAround();
		move();
		turnAround();
	}

	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("What robot world?");
		Display.openWorld("maps/" + filename + ".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);

		gogoman hero = new gogoman();
		hero.solveMaze();
	}
}
