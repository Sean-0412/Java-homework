import edu.fcps.karel2.Display;
public class Lab05 {
    public static void runTherace(Racer man) {
        man.sprint(1);
        man.jumpRight();
        man.sprint(2);
        man.pick(7);
        man.turnAround();
        man.sprint(2);
        man.jumpLeft();
        man.sprint(1);
        man.put(7);
        man.turnAround();

        man.sprint(1);
        man.jumpRight();
        man.sprint(4);
        man.pick(5);
        man.turnAround();
        man.sprint(4);
        man.jumpLeft();
        man.sprint(1);
        man.put(5);
        man.turnAround();

        man.sprint(1);
        man.jumpRight();
        man.sprint(6);
        man.pick(3);
        man.turnAround();
        man.sprint(6);
        man.jumpLeft();
        man.sprint(1);
        man.put(3);
        man.turnAround();

    }
    public static void main(String[] args) {
        Display.openWorld("maps/shuttle.map");
        Display.setSize(16, 16);
        Display.setSpeed(20);

        Racer racer1 = new Racer(1);
        Racer racer2 = new Racer(4);
        Racer racer3 = new Racer(7);
        runTherace(racer1);
        runTherace(racer2);
        runTherace(racer3);
    }
}