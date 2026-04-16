	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003

   import edu.fcps.karel2.Display;
   public class Pirate extends Athlete
   {
      public Pirate()
      {
         super(1, 1, Display.EAST, 0);
        
      }
      public void approachPile()
      {
         while (nextToABeeper() != true) {
         move();
        }
      }

       public int numOfBeepersInPile()
      {
         int count = 0;
         while (nextToABeeper() == true) {
            for (int i = 0; i < 5; i++) {
               if (nextToABeeper() == true) {
                  pickBeeper();
                  count++;
               }
            }
         }
         return count;
      }

      public void turnAppropriately(int beepers)
      {
         if(beepers % 4 == 1) {
            turnLeft();
         }
         else if(beepers % 4 == 2) {
            turnAround();
         }
         else if(beepers % 4 == 3) {
            turnRight();
         }
      }
   }