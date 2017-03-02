
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObediantTourtoise {
	// 1. Make a new class, create a main method, and show the tortoise.
	public static void main(String[] args) {

		// 2. Have the Tortoise draw a square.
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		for(int i = 0; i <4; i ++){
		int q = JOptionPane.showOptionDialog(null, "What Shape", "Shapes", 0, JOptionPane.QUESTION_MESSAGE, null,
				new String[] { "Circle", "Square", "Triangle", "ABigAgon"}, null);

		if(q==1){
		
		Tortoise.setX(100);
		Tortoise.setY(300);
		drawShape(4);
}
else if(q==2){
				Tortoise.setX(100);
		Tortoise.setY(150);
		drawShape(3);

}
else if (q==0){	

Tortoise.setX(234);
Tortoise.setY(258);
Circle();
}
else if (q==3){
	Tortoise.setX(134);
	Tortoise.setY(300);
	drawShape(24);
}
}
	}

	// 3. Extract this code into a drawSquare() method.
	static void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
		}
	}

	//// 4. Have the Tortoise draw a triangle.
	static void Triangle() {
		for (int i = 0; i < 3; i++) {
			
		}
	}
	static void drawShape(int numSides){
			
		for (int i = 0; i < numSides; i++) {
		
	
			Tortoise.move(90);
		
			Tortoise.turn(360/numSides);
			Tortoise.explode();
		}
	}
	// 5. Extract this code into a drawTriangle() method.

	// 6. Have the Tortoise draw a circle.
	static void Circle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
	// 7. Extract this code into a drawCircle() method.

	// 8. Ask the user which shape they want. Draw the appropriate shape
	// depending on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on
	// their answer.

}