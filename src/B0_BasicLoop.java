public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime  = 0;
        plane.trailWidth = 3;

        for (int y=0;y<20;y=y+1){
            for(int x=0;x<20;x=x+1){
                plane.teleport(20+50*x,20+y*40);
                plane.setColor(255-x*13,13*y, x*13);
                System.out.println(x);
                plane.startingAngle(90);
                house((int)(10));
            }
        }
    }

    public  void house(int w){
        for(int x=0;x<3;x=x+1){
            plane.move(w);
            plane.turn(90);
        }
        plane.move(w);
        for(int x=0;x<2;x=x+1){
            plane.turn(-120);
            plane.move(w);
        }
    }
}
