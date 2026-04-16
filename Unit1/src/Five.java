import edu.fcps.Digit;
public class Five extends Digit {
    public Five(int avenue, int street) {
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
