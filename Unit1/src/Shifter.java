	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y, int beepers)
      {
         super(1, y, Display.EAST, beepers);
      
      }
      public void run()
      {
         int[] countarry = new int[10];
         for (int i = 0; i < countarry.length; i++) {
            
            while (nextToABeeper()) {
                pickBeeper();
                countarry[i]++;
            }
            System.out.println(countarry[i]);
            if (i > 0) {
                
                for (int j = 0; j < countarry[i - 1]; j++) {
                    putBeeper();
                }
            }
            move();
        }
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
      @Override
      public void workCorner() {
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'workCorner'");
      }
      @Override
      public void moveOneBlock() {
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'moveOneBlock'");
      }
      @Override
      public void turnToTheRight() {
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'turnToTheRight'");
      }
      @Override
      public void turnToTheNorth() {
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'turnToTheNorth'");
      }
   }