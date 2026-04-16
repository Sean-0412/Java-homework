  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab08
   {
       public static void race(Racer arg)
      {
         while(!arg.nextToABeeper())
         {
            if(arg.frontIsClear())
            {
               arg.move();
            }
            else
            {
               arg.jumpRight();
            }
         }
      }
       public static void main(String[] args) 
      {
         String[] mapOptions = {
            "hurdle1", "hurdle2", "hurdle3",
            "steeple1", "steeple2", "steeple3",
            "boxtop1", "boxtop2", "boxtop3"
         };
         
         String filename = (String) JOptionPane.showInputDialog(
            null,
            "選擇地圖:",
            "Map Selection",
            JOptionPane.PLAIN_MESSAGE,
            null,
            mapOptions,
            mapOptions[0]
         );
         
         if (filename == null) {
            return;
         }
      
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(18, 16);
         Display.setSpeed(10);
      
         if(filename.startsWith("hurdle"))
         {
            race( new Racer(1) );
         }
         else if(filename.startsWith("steeple"))
         {
            race( new SteepleChaseRacer(1) );
         }
         else if(filename.startsWith("boxtop"))
         {
            race( new BoxTopRacer(1) );
         }
      }
   }