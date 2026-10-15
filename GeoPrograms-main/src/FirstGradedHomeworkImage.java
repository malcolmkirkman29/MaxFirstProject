public class FirstGradedHomeworkImage extends World{

    public int randomSymbol;
    public void go(){
        //Setup
        plane.setAngle(0);
        plane.setTrailColor(0,0,0);
        plane.pausetime = 0;
        plane.hasTrail = true;

        //Sunset
        plane.trailWidth = 5;
        plane.setAngle(0);
        for(int x = 0; x<160; x++){
            plane.teleport(0,x*5);
            plane.setTrailColor(255-x,50,x);
            plane.move(1000);
        }//End of for loop

        //Stem
        plane.trailWidth = 20;
        plane.teleport(425,800);
        plane.setTrailColor(0,255,0);
        for (int x = 0; x<3; x++){
            plane.hasTrail = true;
            plane.setAngle(0);
            hexagon(5);
            plane.setAngle(-90);
            plane.hasTrail = false;
            plane.move(90);
        }//End of for loop

        //Leaf
        plane.hasTrail = true;
        plane.teleport(500,590);
        plane.setAngle(90);
        pentagon(6);
        plane.teleport(518,620);
        plane.setTrailColor(0,130,30);
        plane.setAngle(0);
        plane.move(25);


        //Flower
        plane.teleport(500,400);
        plane.setTrailColor(255, 130, 250);
        plane.setAngle(0);

            //Draws petals
        for (int x = 0; x<8; x++){
            plane.turnLeft(180);
            pentagon(10);
            plane.turnLeft(225);
            plane.move(100);

        }//End of for loop
            //Adds yellow inside
        plane.setTrailColor(255,255,0);
        plane.setAngle(-45);
        for (int x = 0; x<8; x++){
            plane.move(100);
            plane.turnLeft(45);
        }//End of for loop

        //Randomized Symbols
        plane.teleport(395,370);
        plane.setAngle(0);
        plane.setTrailColor(150,75,0);
        plane.trailWidth = 5;

            //Picks random number in order to determine which of four symbols will be drawn
        randomSymbol = plane.random(0,4);
        if(randomSymbol==0){
            //Star
            plane.setAngle(-36);
            for(int x = 0; x<5; x++) {
                plane.move(200);
                plane.turnLeft(144);
            }//End of for loop
        }//End of if 0
        if(randomSymbol==1){
            //Pentagon
            pentagon(12);
        }//End of if 1
        if(randomSymbol==2){
            //Rectangle
            for(int x = 0; x<2; x++){
                plane.move(120);
                plane.turnLeft(90);
                plane.move(160);
                plane.turnLeft(90);
            }//End of for loop
        }//End of if 2
        if(randomSymbol==3){
            //Hexagon
            plane.hasTrail = false;
            plane.move(10);
            plane.hasTrail = true;
            hexagon(10);
        }//End of if 3


    }//End of go

    public void pentagon(int size){
        for (int x=0;x<5;x++){
            plane.move(10*size);
            plane.turnLeft(72);
        }//End of for loop

    }//End of pentagon

    public void hexagon(int size){
        for (int x=0;x<6;x++){
            plane.move(10*size);
            plane.turnLeft(60);
        }//End of for loop
    }//End of hexagon
}//End of file

//Flower made of different geometric shapes
