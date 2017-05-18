import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class StaryNight {
	// 1. Create a new Robot.
static Robot cc=new Robot("batman");
	public StaryNight() {
		// 2. Using your robot name, print the window width and height to the console
		//    robotname.getWindow().getWidth(), robotname.getWindow().getHeight()

		// 3. Set the robot's speed to draw FAST!

	cc.penDown();	// 10. Do steps 7, 8 and 9 100 times.

for(int eqw = 0; eqw<200; eqw++){
			// 7. Move your robot to a random position using the method created
//     in step 5. Use the random method to get the new X and Y positions.
			//    The syso in step 2 should help you determine how big your canvas is.
		cc.setSpeed(10);
			// 8. Set your robot pen color to be random, using the method 
//      created in step 6.
cc.setRandomPenColor();
		int h = new Random().nextInt(100);
			// 9. Draw a star by calling your method created in step 4.
xy();			//    Use the random method to make the size of your star random.
star(h);
}
	cc.hide();	// 11. Hide your robot so that you can see your beautiful starry sky!!
	}

	// 4. Create a method that draws a star. It should have an int parameter 
	//    that determines the size of the star.
	//    Hint: 144 degrees
 static void star(int p){
	
	for(int i = 0; i<5; i++){
	
		cc.move(p);
	cc.turn(144);
	}
}
	
	// 5. Create a method that moves the robot using setX and setY.
	//    The method should have 2 int parameters for the X and Y position.
static void xy(){
		cc.penUp();
		int x = new Random().nextInt(1780);
	int y = new Random().nextInt(950);

	cc.moveTo(x, y);
	cc.penDown();
}

	// 6. Create a method that RETURNS a random number.
	//    The method should have 2 int parameters for the minimum and maximum values
//     of the random number.

	public static void main(String[] args) {
		new StaryNight();
	}
}


