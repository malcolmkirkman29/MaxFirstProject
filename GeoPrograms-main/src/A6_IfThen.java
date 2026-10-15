public class A6_IfThen extends World {

    public int randNum;
    public int randoma;

    public void go() {
        plane.setTrailColor(0,0,0);
        plane.hasTrail = true;
        plane.pausetime = 1;
        plane.teleport(350, 400);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            randoma = plane.random(100,300);
            rectangle(randoma, 100);
        }
        if (randNum == 2) {
            randoma = plane.random(30,90);
            rectangle(randoma, 100);
        }
        if (randNum ==3) {
            manatee();
        }
    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }
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
    }
}



