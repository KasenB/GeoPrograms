public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.teleport(0,250);
        plane.pausetime=0;
        plane.trailWidth=2;
        plane.turn(90);


//        for (int h = 0; h <= 800; h = h + 10){
//           // System.out.println(h);
//            rowOfSquares(h);
//        }

        practiceLoops();

    } // end of go method

    public void practiceLoops() {
        for(int y=100; y>=-2; y=y-3){
            System.out.println(y);
        }

    }

    public void rowOfSquares(int yCoord){
        int squareSize =10;

        for(int x=0;x<=1000;x=x+squareSize)
        {
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            //System.out.println(x);
            plane.teleport(x,yCoord);
            plane.square(squareSize);
            plane.turn(360);

        }
    }
} // end of class
