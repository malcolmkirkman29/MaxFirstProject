public class A5_Homework extends World{

    public int randomRed;
    public int randomGreen;
    public int randomBlue;

    public int randomX;
    public int randomY;

    public void go() {

        plane.trailWidth = 5;
        plane.pausetime = 1;
        plane.hasTrail = true;

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);

        randomX = plane.random(100,900);
        randomY = plane.random(150,650);
        plane.teleport(randomX,randomY);

        house(plane.random(1,20));

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);

        randomX = plane.random(100,900);
        randomY = plane.random(150,650);
        plane.teleport(randomX,randomY);

        house(plane.random(1,20));

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);

        randomX = plane.random(100,900);
        randomY = plane.random(150,650);
        plane.teleport(randomX,randomY);

        house(plane.random(1,20));

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);

        randomX = plane.random(100,900);
        randomY = plane.random(150,650);
        plane.teleport(randomX,randomY);

        cube();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);

        randomX = plane.random(100,900);
        randomY = plane.random(150,650);
        plane.teleport(randomX,randomY);

        cube();

    }

    public void house(int size) {
        plane.setAngle(0);
        plane.move(15*size);
        plane.setAngle(90);
        plane.move(15*size);
        plane.setAngle(180);
        plane.move(15*size);
        plane.setAngle(270);
        plane.move(15*size);
        plane.setAngle(310);
        plane.move(12*size);
        plane.setAngle(50);
        plane.move(12*size);
        plane.hasTrail=false;
        plane.setAngle(90);
        plane.move(15*size);
        plane.setAngle(180);
        plane.move(6*size);
        plane.setAngle(270);
        plane.hasTrail=true;

        plane.move(5*size);
        plane.setAngle(180);
        plane.move(3*size);
        plane.setAngle(90);
        plane.move(5*size);
    }

    public void cube (){
        //Front Square
        plane.setAngle(0);
        plane.hasTrail = true;
        plane.move(100);
        plane.setAngle(90);
        plane.move(100);
        plane.setAngle(180);
        plane.move(100);
        plane.setAngle(270);
        plane.move(100);
        //1st corner
        plane.setAngle(45);
        plane.move(50);

        //2nd square
        plane.hasTrail = false;
        plane.setAngle(45);
        plane.move(50);
        plane.hasTrail = true;
        plane.setAngle(0);
        plane.move(100);
        plane.setAngle(90);
        plane.move(100);
        plane.setAngle(180);
        plane.move(100);
        plane.setAngle(270);
        plane.move(100);
        //corners 2-4
        plane.hasTrail = false;
        plane.setAngle(0);
        plane.move(100);
        //draw
        plane.hasTrail = true;
        plane.setAngle(225);
        plane.move(50);
        //return
        plane.hasTrail = false;
        plane.setAngle(45);
        plane.move(50);
        //corner 3
        plane.setAngle(90);
        plane.move(100);
        //draw
        plane.hasTrail = true;
        plane.setAngle(225);
        plane.move(50);
        //Return
        plane.hasTrail = false;
        plane.setAngle(45);
        plane.move(50);
        //corner 4
        plane.setAngle(180);
        plane.move(100);
        //draw
        plane.hasTrail = true;
        plane.setAngle(225);
        plane.move(50);

        //move plane
        plane.hasTrail = false;
        plane.move(100);
    }

}