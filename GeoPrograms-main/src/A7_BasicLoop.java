public class A7_BasicLoop extends World {

    //Creates color related variables
    public int red;
    public boolean redTrue;
    public int green;
    public boolean greenTrue;
    public int blue;
    public boolean blueTrue;
    public int color;

    public int randomRed;
    public int randomGreen;
    public int randomBlue;

    //Creates movement related variables
    public int randomX;
    public int randomY;
    public int randomAngle;
    public int randomSize;



    public void go() {
        //Setup
        plane.hasTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 10;

        //Elements to a "for loop":
        //int x is variable/declaration
        //x<8 is question/conditional
        //x=x+1 is increment
//        for(int y=0;y<12;y++){
//            //Reset all variables
//            red = 0;
//            green = 0;
//            blue = 0;
//            redTrue = false;
//            greenTrue = false;
//            blueTrue = false;
//
//            //Picks random color
//            color = plane.random(0,3);
//            if (color == 0){
//                redTrue = true;
//            }//End of if statement
//            if (color == 1){
//                greenTrue = true;
//            }//End of if statement
//            if (color == 2){
//                blueTrue = true;
//            }//End of if statement
//
//            //Picks angle
//            randomAngle = plane.random(0,360);
//            plane.setAngle(randomAngle);
//
//            //Teleports to random location
//            randomX = plane.random(0,1000);
//            randomY = plane.random(0,800);
//            plane.teleport(randomX,randomY);
//
//            randomSize = plane.random(5,20);
//
//            //Draws spirograph
//            for(int x=0;x<37;x=x+1) {
//                //Picks color
//                if (redTrue==true){
//                    red=red+5;
//                }//End of if statement
//                if (greenTrue==true){
//                    green=green+5;
//                }//End of if statement
//                if (blueTrue==true){
//                    blue=blue+5;
//                }//End of if statement
//
//                //Draws square
//                plane.setTrailColor(red,green,blue);
//                square(randomSize);
//                plane.turnLeft(10);
//            }//End of loop
//        }//End of loop

        for (int y=0;y<5;y++){

            plane.teleport(50,(y*150)+150);

            for(int x=0; x<6; x++){
                //Sets random color
//            randomRed = plane.random(0,255);
//            randomGreen = plane.random(0,255);
//            randomBlue = plane.random(0,255);
//            plane.setTrailColor(randomRed,randomGreen,randomBlue);

                plane.setTrailColor(y*60,0,x*50);
                plane.hasTrail = true;
                differentsquare();
                plane.hasTrail = false;
                plane.move(150);

            }
        }


    }//End of go

    public void square(int size){
        for (int x = 0; x<4;x++){
            plane.move(size*10);
            plane.turnLeft(90);
        }//End of loop
    }//End of square

    public void differentsquare (){
        for (int x = 0; x<4;x++){
            plane.move(100);
            plane.turnLeft(90);
        }//End of loop
    }//End of differentsquare

    public void manatee(){
        //Starting body
        plane.setAngle(0);
        plane.move(200);
        plane.setAngle(45);
        plane.move(100);
        plane.setAngle(90);
        plane.move(100);

        //Tail
        plane.setAngle(0);
        plane.move(25);
        plane.setAngle(45);
        plane.move(50);
        plane.setAngle(90);
        plane.move(50);
        plane.setAngle(135);
        plane.move(50);
        plane.setAngle(180);
        plane.move(100);
        plane.setAngle(225);
        plane.move(50);
        plane.setAngle(270);
        plane.move(50);
        plane.setAngle(315);
        plane.move(50);
        plane.setAngle(0);
        plane.move(25);

        //Continuing Body
        plane.setAngle(225);
        plane.move(50);
        plane.setAngle(180);
        plane.move(100);
        plane.setAngle(135);
        plane.move(50);
        plane.setAngle(180);
        plane.move(100);
        plane.setAngle(225);
        plane.move(50);

        //Head
        plane.setAngle(135);
        plane.move(50);
        plane.setAngle(180);
        plane.move(100);
        plane.setAngle(225);
        plane.move(50);
        plane.setAngle(270);
        plane.move(100);
        plane.setAngle(315);
        plane.move(50);
        plane.setAngle(0);
        plane.move(100);
        plane.setAngle(45);
        plane.move(50);
        plane.setAngle(-45);
        plane.move(50);

        //Finishing touches
        plane.setAngle(0);
        plane.move(50);
        plane.setAngle(180);
        plane.hasTrail = false;
        plane.move(200);

        plane.setAngle(90);
        plane.move(40);
        plane.hasTrail = true;
        plane.move(40);
        plane.setAngle(-90);
        plane.hasTrail = false;
        plane.move(80);
        plane.setAngle(0);
        plane.move(50);
        plane.setAngle(90);
        plane.move(40);
        plane.hasTrail = true;
        plane.move(40);

        plane.hasTrail = false;
        plane.move(90);
        plane.hasTrail = true;
        plane.move(25);
        plane.setAngle(180);
        plane.move(50);
        plane.setAngle(270);
        plane.move(25);
    }//End of manatee
}//End of program