
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
public class ObediantTourtoise {
//1. Make a new class, create a main method, and show the tortoise.
public static void main(String[] args) {
	

//2. Have the Tortoise draw a square.
Tortoise.setSpeed(10);
Tortoise.penDown();
JOptionPane.showOptionDialog(null, "What Shape", "Shapes", 0,
		JOptionPane.QUESTION_MESSAGE, null, new String [] {"Circle", "Square", "Triangle"}, null);
drawSquare();
Tortoise.setX(100);
Tortoise.setY(200);
drawSquare();
Tortoise.setX(500);
Tortoise.setY(100);
drawSquare();
Tortoise.setX(400);
Tortoise.setY(300);
Triangle();
Tortoise.setX(500);
Tortoise.setY(150);
Circle();



}







//3. Extract this code into a drawSquare() method.
static void drawSquare (){
	for(int i = 0; i<4; i++){
Tortoise.move(90);
Tortoise.turn(90);
Tortoise.explode();
	}
}
////4. Have the Tortoise draw a triangle.
static void Triangle(){
	for(int i = 0; i<3; i++){
		Tortoise.move(50);
		Tortoise.turn(120);
	}
}
//5. Extract this code into a drawTriangle() method.

//6. Have the Tortoise draw a circle.
static void Circle(){
	for(int i = 0; i<360; i++){
		Tortoise.move(1);
		Tortoise.turn(1);
	}
}
//7. Extract this code into a drawCircle() method.

//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

//9. Ask the user which color they want. Color the the shape depending on their answer.

}