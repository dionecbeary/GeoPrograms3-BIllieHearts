public class GradedPicture extends World{
    public int red;
    public int blue;
    public int green;

    public void go(){
        plane.loadBackGround("billie.jpeg");//626x417
        plane.showBackGround();
        for(int row=0; row<plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
        {
            for(int col=0; col<plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col,row);

                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();

                if(150>red && red>0 && 200>green && green>60 && 80>blue && blue>0) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(40,90,15);
                }
                if(130>red && red>90 && 170>green && green>130 && 140>blue && blue>80) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(100,150,110);
                }
                if(200>red && red>150 && 225>green && green>190 && 230>blue && blue>170) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(175,207,200);
                }
                if(255>red && red>230 && 255>green && green>220 && 225>blue && blue>200) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(240,240,230);
                }
                if(230>red && red>200 && 220>green && green>180 && 200>blue && blue>180) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(215,200,190);
                }
                if(220>red && red>150 && 180>green && green>120 && 200>blue && blue>130) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(180,150,165);
                }
                if(255>red && red>230 && 220>green && green>200 && 235>blue && blue>220) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(240,210,225);
                }
                if(185>red && red>140 && 135>green && green>100 && 120>blue && blue>90) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(160,120,105);
                }
                if(130>red && red>85 && 150>green && green>80 && 190>blue && blue>100) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(120,120,190);
                }
            }
        }
        this.plane.isTrail = true;
        this.plane.pausetime=0;
        for(int hearts=0; hearts<(int)(Math.random() * 5)+8; hearts++){
            this.plane.teleport((int)(Math.random()*530),(int)(Math.random()*800));
            int rand=2*((int)(Math.random() * 3.0) + 2);
            this.plane.trailWidth=rand*2;
            this.plane.setColor((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
            this.plane.startingAngle(-45);
            this.plane.move(rand*6);
            this.plane.startingAngle(-135);
            this.plane.move(rand*3);
            this.plane.startingAngle(135);
            this.plane.move(rand*3);
            this.plane.startingAngle(-135);
            this.plane.move(rand*3);
            this.plane.startingAngle(135);
            this.plane.move(rand*3);
            this.plane.startingAngle(45);
            this.plane.move(rand*6);
        }
    }
}
//            red   = plane.howMuchRed();
//                    green = plane.howMuchGreen();
//                    blue  = plane.howMuchBlue();
//                    for(int col=1; col<plane.getBackGroundWidth(); col++){
//        plane.teleport(col,row);
//        plane.setPixelColor(red,green,blue);
//        }