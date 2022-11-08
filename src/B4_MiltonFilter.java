public class B4_MiltonFilter extends World {

   public int red;
   public int blue;
   public int green;

   public void go() {
      plane.loadBackGround("rufus.jpeg");          //*** new method to load a diffrent JPG
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0, 0);
      plane.showBackGround();
      System.out.println(plane.howMuchRed());

      for(int row=80; row<170; row++)    //*** this is using new getBackground
      {
         for(int col=280; col<430; col++)    //*** this is using new getBackgroun
         {
            plane.teleport(col,row);

            red   = plane.howMuchRed();
            green = plane.howMuchGreen();
            blue  = plane.howMuchBlue();

            if(170>red && red>120 && 150>green && green>110 && 150>blue && blue>120) //&&green<240 && blue< 100)
            {
               plane.setPixelColor(40,40,40);
            }
         }
      }

//      for(int row=1; row<plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
//      {
//         for(int col=1; col<plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
//         {
//            plane.teleport(col,row);
//
//            red   = plane.howMuchRed();
//            green = plane.howMuchGreen();
//            blue  = plane.howMuchBlue();
//
//            if(255>red && red>200 && 200>green && green>150 && 200>blue && blue>150) //&&green<240 && blue< 100)
//            {
//               plane.setPixelColor(0,250,154);
//            }
//            if(160>red && red>140 && 130>green && green>120 && 90>blue && blue>70) //&&green<240 && blue< 100)
//            {
//               plane.setPixelColor(255,140,0);
//            }
//            if(240>red && red>220 && 250>green && green>220 && 256>blue && blue>220) //&&green<240 && blue< 100)
//            {
//               plane.setPixelColor(255,215,0);
//            }
//         }
//      }

//      for (int row = 500; row < 680; row++)    //*** this is using new getBackground
//      {
//         for (int col = 50; col < 430; col++)    //*** this is using new getBackgroun
//         {
//            plane.teleport(col, row);
//
//            red = plane.howMuchRed();
//            green = plane.howMuchGreen();
//            blue = plane.howMuchBlue();
//
//            if (250 > red && red > 230 && 260 > green && green > 190 && 25 > blue && blue > 0) //&&green<240 && blue< 100)
//            {
//               plane.setPixelColor(255, 165, 0);
//            }
//         }
//      }
//
//      for (int row = 340; row < 520; row++)    //*** this is using new getBackground
//      {
//         for (int col = 110; col < 300; col++)    //*** this is using new getBackgroun
//         {
//            plane.teleport(col, row);
//
//            red = plane.howMuchRed();
//            green = plane.howMuchGreen();
//            blue = plane.howMuchBlue();
//
//            if (256 > red && red > 160 && 10 > green && 20 > blue) //&&green<240 && blue< 100)
//            {
//               plane.setPixelColor(255, 20, 147);
//            }
//         }
//      }
//
//      for (int row = 341; row < 520; row++)    //*** this is using new getBackground
//      {
//         for (int col = 110; col < 300; col++)    //*** this is using new getBackgroun
//         {
//            plane.teleport(col, row);
//
//            red = plane.howMuchRed();
//            green = plane.howMuchGreen();
//            blue = plane.howMuchBlue();
//
//            if (256 > red && red > 160 && 10 > green && 20 > blue) //&&green<240 && blue< 100)
//            {
//               plane.setPixelColor(255, 20, 147);
//            }
//         }
//      }
   }
}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/