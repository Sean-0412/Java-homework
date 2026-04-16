import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class quiz3 {
	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSize(50, 32);
		Display.setSpeed(10);

		// Fully mirrored version of quiz2 (EECS-02): order + segment strokes.
		new MirrorTwo(1, 18).display();
		new MirrorZero(8, 18).display();
		new MirrorDash(15, 18).display();
		new MirrorS(22, 18).display();
		new MirrorC(29, 18).display();
		new MirrorE(36, 18).display();
		new MirrorE(43, 18).display();
	}
}

class MirrorE extends Digit {
	public MirrorE(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_Off();
		segment7_On();
	}
}

class MirrorC extends Digit {
	public MirrorC(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_Off();
		segment7_Off();
	}
}

class MirrorS extends Digit {
	public MirrorS(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_On();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_Off();
		segment7_On();
	}
}

class MirrorDash extends Digit {
	public MirrorDash(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_Off();
		segment2_Off();
		segment3_Off();
		segment4_Off();
		segment5_Off();
		segment6_Off();
		segment7_On();
	}
}

class MirrorZero extends Digit {
	public MirrorZero(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_On();
		segment6_On();
		segment7_Off();
	}
}

class MirrorTwo extends Digit {
	public MirrorTwo(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_Off();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_On();
		segment7_On();
	}
}
