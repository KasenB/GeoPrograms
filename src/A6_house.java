public class A6_house extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;

        plane.teleport(0,0);
        background();
        house();
        equitriangle(100);
        rectangle(50,100);
    }

    public void background(){
        plane.trailWidth=10000;
        plane.startingAngle(0);
        plane.move(1000);
        plane.teleport(500,500);
    }

    public void big() {
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);


    }

    public void small(int a, int b,int c) {
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);


    }


    public void house() {
        plane.trailWidth=5;
        plane.isTrail = true;
        plane.setColor(90,90,0);
        plane.startingAngle(0);
        square(100);
        plane.isTrail = false;
        plane.startingAngle(270);
        plane.move(200);
        plane.isTrail = true;
        plane.pausetime = 0;
        sun(20);
    }

    public void square(int a) {
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }

    public void equitriangle(int c) {
        plane.teleport(200,150);
        plane.startingAngle(0);
        plane.setColor(0,0,0);
        plane.trailWidth = 1;
        plane.move(c);
        plane.turn(120);
        plane.move(c);
        plane.turn(120);
        plane.move(c);

    }

    public void rectangle(int a, int b) {
        plane.isTrail= true;
        plane.teleport(250,250);
        plane.startingAngle(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(35);
        plane.turn(-90);
        plane.move(50);


    }

    public void fillRec(int a, int b) {


    }

    public void tree(int a) {

    }

    public void sun(int a) {
        plane.setColor(255, 255, 0);
        plane.fillCircle(a);
    }

}


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

