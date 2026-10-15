//Perimeter is a special variable that is made in the parenthesis of the method
//It can only be used in the method
//For variables there are integers, booleans, doubles
public class A5_Square extends World {

    int randomRed;
    int randomGreen;
    int randomBlue;

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 1;

        //non overlapping squares
        randomRed=plane.random(0,255);
        randomGreen=plane.random(0,255);
        randomBlue=plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        plane.setAngle(plane.random(0,180));
        square(plane.random(1,30));

        randomRed=plane.random(0,255);
        randomGreen=plane.random(0,255);
        randomBlue=plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        plane.setAngle(plane.random(0,180));
        square(plane.random(1,30));

        randomRed=plane.random(0,255);
        randomGreen=plane.random(0,255);
        randomBlue=plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        plane.setAngle(plane.random(0,180));
        square(plane.random(1,30));

        randomRed=plane.random(0,255);
        randomGreen=plane.random(0,255);
        randomBlue=plane.random(0,255);
        plane.setTrailColor(randomRed,randomGreen,randomBlue);
        plane.setAngle(plane.random(0,180));
        square(plane.random(1,30));

        //stacked squares
//        randomRed=plane.random(0,255);
//        randomGreen=plane.random(0,255);
//        randomBlue=plane.random(0,255);
//        plane.setTrailColor(randomRed,randomGreen,randomBlue);
//        plane.setAngle(90);
//        square(1);
//        randomRed=plane.random(0,255);
//        randomGreen=plane.random(0,255);
//        randomBlue=plane.random(0,255);
//        plane.setTrailColor(randomRed,randomGreen,randomBlue);
//        plane.setAngle(90);
//        square(2);
//        randomRed=plane.random(0,255);
//        randomGreen=plane.random(0,255);
//        randomBlue=plane.random(0,255);
//        plane.setTrailColor(randomRed,randomGreen,randomBlue);
//        plane.setAngle(90);
//        square(3);
//        randomRed=plane.random(0,255);
//        randomGreen=plane.random(0,255);
//        randomBlue=plane.random(0,255);
//        plane.setTrailColor(randomRed,randomGreen,randomBlue);
//        plane.setAngle(90);
//        square(4);
//        randomRed=plane.random(0,255);
//        randomGreen=plane.random(0,255);
//        randomBlue=plane.random(0,255);
//        plane.setTrailColor(randomRed,randomGreen,randomBlue);
    }


    public void square(int size) {
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(10*size);
        plane.turnLeft(90);
        plane.move(10*size);
        plane.turnLeft(90);
        plane.move(10*size);
        plane.turnLeft(90);
        plane.move(10*size);
        // notice the direction your plane is facing at this point
    }

}


