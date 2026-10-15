public class A3_Color extends World {

    //Variables
    public int randomRed;
    public int randomGreen;
    public int randomBlue;
    public int randomAngle;
    public int randomRadius;
    public int randomDraw;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        randomAngle = plane.random(0,365);
        plane.setAngle(randomAngle);
        randomDraw = plane.random(0,2);
        if(randomDraw == 0){
            plane.hasTrail = true;
        }
        if(randomDraw == 1){
            plane.hasTrail = false;
        }
        plane.trailWidth = 50;
        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        randomRadius=plane.random(25,250);

        //Manatees have skin that is 3 inches thick
        //Their closest relatives are the elephant and the hyrax
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.move(100);

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);

        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        plane.trailWidth = 10;
        plane.circle(randomRadius);

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        square();

    } //End of go

    public void square(){
        randomAngle = plane.random(0,360);
        plane.setAngle(randomAngle);

        plane.hasTrail=true;
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
    }//End of square

} //End of file
//weeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
//eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee