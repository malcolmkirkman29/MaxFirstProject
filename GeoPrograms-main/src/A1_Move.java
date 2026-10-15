public class A1_Move extends World {

    //variables
    public int randomRed;
    public int randomGreen;
    public int randomBlue;

    public int randomX;
    public int randomY;

    public void go() {

        //Test
        System.out.println("This message will be printed to the window below.");

        //Setup
        plane.pausetime = 0;
        plane.hasTrail = true;
        plane.trailWidth = 5;

        //Program
        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();

        randomRed = plane.random(0,255);
        randomGreen = plane.random(0,255);
        randomBlue = plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);

        randomX = plane.random(0,1000);
        randomY = plane.random(0,800);
        plane.teleport(randomX,randomY);
        manatee();
    }

    public void manatee() {
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

        plane.setTrailColor(0,0,0);
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
        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        plane.move(25);
        plane.setAngle(180);
        plane.move(50);
        plane.setAngle(270);
        plane.move(25);
    }

}

