

public class A3_changeMyColor extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.startingAngle(0);
        plane.setColor(130, 0, 130);
        plane.move(500);
        plane.turn(-120);
        plane.setColor(130, 130, 0);
        plane.move(500);
        plane.turn(-120);
        plane.setColor(0, 130, 130);
        plane.move(500);

    }


}
