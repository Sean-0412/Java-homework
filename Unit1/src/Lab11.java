import edu.fcps.karel2.Display;

public class Lab11 {

    public static void main(String[] args) {
        Display.openDefaultWorld();
        Display.setSize(36, 32);
        Display.setSpeed(10);
        
        // Your code goes here.
        //Zero zero = new Zero(1, 18);
        //zero.display(); 
        new One(1, 18).display();
        new One(8, 18).display();
        new Three(15,18).display();
        new Zero(22, 18).display();
        new Seven(29, 18).display();
        new Zero(1, 9).display();
        new Zero(8, 9).display();
        new Two(15, 9).display();
    }
    
}
