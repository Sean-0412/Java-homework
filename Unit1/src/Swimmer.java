
//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Swimmer extends Robot implements Runnable {
   public Swimmer(int x) {
      super(x, 1, Display.NORTH, 0);
   }

   public void run() // not swim
   {
      while (true) {
         for (int i = 0; i < 7; i++) {
            move();
         }
         turnLeft();
         turnLeft();
         
      }

   }
}