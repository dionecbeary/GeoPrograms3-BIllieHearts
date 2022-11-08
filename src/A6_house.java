public class A6_house extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;

        for (int n=0;n<5;n=n+1) {
            int num = ((int)(Math.random()*3)+1);
            System.out.println(num);
            plane.teleport(40+150*n ,500);
            if(num == 1)
            {
                house(40,50);
            }
            if(num == 2)
            {
                rectangle(50,60);
            }
            if(num == 3)
            {
                equitriangle(50);
            }
        }
    }

    public void house(int w, int h) {

        plane.isTrail = true;
        plane.trailWidth = 3;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);

        mysquare(w, h);
        myroof(w);
    }

    public void myroof(int w){
//        plane.setColor(200, 200, 200);
        plane.turn(-120);
        plane.move(w);

        plane.turn(-120);
        plane.move(w);
    }

    public void mysquare(int w, int h) {
        plane.setColor(188, 69, 85);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(h);
        plane.turn(90);
        plane.move(w);
        plane.turn(90);
        plane.move(h);
        plane.turn(90);
        plane.move(w);
    }

    public void sun(int d) {
        plane.setColor(250, 191, 61);
        plane.fillCircle(d);
    }

    public void plant(int x, int y, int r, int g,int b){
        plane.teleport(x,y);
        stem();
        flower(r, g, b);
    }

    public void stem() {
        plane.trailWidth = 5;
        plane.setColor(81, 205, 13);
        plane.startingAngle(-90);
        plane.move(30);
        plane.turn(-90);
        plane.move(10);
        plane.turn(70);
        plane.move(10);
        plane.turn(110);
        plane.move(10);
        plane.turn(70);
        plane.move(10);
        plane.turn(-160);
        plane.move(30);
    }

    public void flower(int r, int g, int b){
        plane.setColor(r,g,b);
        plane.startingAngle(-99);
        petal();
        petal();
        petal();
        petal();
        petal();

    }

    public void petal(){
        plane.turn(-156);
        plane.move(13);
        plane.turn(48);
        plane.move(13);
        plane.turn(132);
        plane.move(13);
        plane.turn(48);
        plane.move(13);
    }

    public void equitriangle(int b) {
        plane.turn(-120);
        plane.setColor(200, 200, 0);
        plane.move(b);

        plane.turn(-120);
        plane.setColor(200, 0, 200);
        plane.move(b);

        plane.turn(-120);
        plane.setColor(0, 200, 200);
        plane.move(b);

    }

    public void rectangle(int a, int c) {
        plane.move(a);
        plane.turn(90);
        plane.move(c);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(c);
        plane.turn(90);
    }
}

//
//    public void fillRec(int a, int b) {
//
//
//    }
//



/*

Methods:
- fillCircle(int x)
   fillCircle() draws a filled circle with a radius size specified in the parameter.
   plane.fillCircle(10); draws a circle of radius 10 pixels.

- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int pausetime
   pausetime is used to speed up or slow down the plane. The default value is 5.
   plane.pausetime = 10; slows the plane down.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/

