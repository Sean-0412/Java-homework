import edu.fcps.karel2.Display;

public class Lab02 {
    
    public static void main(String[] args) {
        // Open the 8x8 maze world
        Display.openWorld("maps/maze.map");
        Display.setSize(8, 8);
        Display.setSpeed(5);
        
        // Create Athlete object at starting position (1, 1)
        Athlete athlete = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
        
        // Escape the maze following a simple path
        // Leave beepers to mark the path
        athlete.move();
        athlete.turnRight();
        athlete.move();
        athlete.turnRight();
        athlete.move();
        athlete.turnLeft();
        athlete.move();
        athlete.turnLeft();
        athlete.move();
        athlete.turnRight();
        athlete.move();
        athlete.move();
        athlete.turnRight();
        athlete.move();
        athlete.turnLeft();
        athlete.move();
        athlete.turnLeft();
        athlete.move();
        athlete.move();
        athlete.move();
        athlete.move();
        athlete.turnRight();    
        athlete.move();
        athlete.move();
    }   
}