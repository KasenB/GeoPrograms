public class A7_practiceWithMethods extends World{

    public void go() {
    drawK();
    drawB(100);
    }

    public void drawK() {
        plane.pausetime=1;
        plane.isTrail=true;
        plane.trailWidth=plane.random(5,25);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(200);
        plane.teleport(300,250);
        plane.turn(-45);
        plane.trailWidth=plane.random(5,25);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(125);
        plane.trailWidth=plane.random(5,25);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.turn(90);
        plane.move(150);
    }

    public void drawB(int size){
        plane.teleport(500,250);
        plane.turn(-45);
        plane.trailWidth=plane.random(5,15);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(size);
        plane.teleport(500,250);
        plane.turn(45);
        plane.trailWidth=plane.random(5,15);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(size*1/3);
        plane.turn(-90);
        plane.trailWidth=plane.random(5,15);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(size*1/3);
        plane.turn(90);
        plane.trailWidth=plane.random(5,15);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(size*1/3);
        plane.turn(-450);
        plane.trailWidth=plane.random(5,15);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.move(size*1/3);


    }

}
