import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class quiz2 {
	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSize(50, 32);
		Display.setSpeed(10);

		new E(1, 18).display();
		new E(8, 18).display();
		new C(15, 18).display();
		new S(22, 18).display();
		new Dash(29, 18).display();
		new Zero(36, 18).display();
		new Two(43, 18).display();
	}
}

class E extends Digit {
	public E(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_Off();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_On();
		segment7_On();
	}
}

class C extends Digit {
	public C(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_Off();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_On();
		segment7_Off();
	}
}

class S extends Digit {
	public S(int avenue, int street) {
		super(avenue, street);
	}

	@Override
	public void display() {
		// Seven-segment S is the same shape as 5.
		segment1_On();
		segment2_Off();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_On();
		segment7_On();
	}
}

class Dash extends Digit {
	public Dash(int avenue, int street) {
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
