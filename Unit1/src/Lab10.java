
import edu.fcps.karel2.Display;

public class Lab10 {

    public static void main(String[] args) {
        // Lab10 logic with Lab10 map - 右手貼牆走迷宮
        Display.openWorld("maps/maze1.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        
        
        
        Athlete AI = new Athlete(1, 1, Display.NORTH, Integer.MAX_VALUE);
        
        // 使用右手規則走迷宮
        while(!AI.nextToABeeper()) {  // 直到碰到出口（信標）
            // 優先嘗試向右轉並走
            if(AI.rightIsClear()) {
                AI.turnRight();
                AI.move();
            }
            // 如果右邊被擋，嘗試直走
            else if(AI.frontIsClear()) {
                AI.move();
            }
            // 如果前方也被擋，嘗試向左轉並走
            else if(AI.leftIsClear()) {
                AI.turnLeft();
                AI.move();
            }
            // 如果三個方向都被擋，轉身
            else {
                AI.turnAround();
            }
        }
    }
}
