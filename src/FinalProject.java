public class FinalProject extends World {
    public int red;
    public int blue;
    public int green;


    public void go(){
        plane.teleport(0, 0);
        plane.loadBackGround("Henpaws.jpg");
        plane.showBackGround();


        for (int row = 500; row < 666; row = row + 1) {
            for (int col = 0; col < 500; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if(red >= 85 && blue <=40){
                    plane.setPixelColor(0,0,255);
                }
            }
        }
        for (int row = 160; row < 666; row = row + 1) {
            for (int col = 0; col < 500; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if(red >= 170 && blue >= 70 && green >= 90){
                    plane.setPixelColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
                }
            }
        }

        for (int row = 75; row < 183; row = row + 1) {
            for (int col = 380; col < 440; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if(red >= 140 && blue >= 140 && green >= 140){
                    plane.setPixelColor(255,100,0);
                }
            }
        }
        leftEye(150);
        //hexagon(20);
    }

    public void leftEye(int a) {

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(125,321);
        plane.setColor(255,0,0);
        plane.fillCircle(a);
        plane.teleport(500,666);
    }

    public void hexagon(int sides){
        for(int z=1;z<=sides;z=z+1){
            plane.teleport(180,322);
            plane.trailWidth=5;
            plane.move(8);
            plane.turn(360/sides);
            System.out.println(z);
        }
        plane.teleport(500,666);
    }
}
