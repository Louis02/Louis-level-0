
// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			// 3. ask the user what color they would like the tortoise to draw
			String colorans = JOptionPane.showInputDialog("What color would you like to choose");
			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (colorans.equals("red")) {
				Tortoise.setPenColor(Color.red);

			} else if (colorans.equals("blue")) {
				Tortoise.setPenColor(Color.blue);
			} else if (colorans.equals("orange")) {
				Tortoise.setPenColor(Color.orange);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else {
				Tortoise.setPenColor(PenColors.getRandomColor());
			}

			// 6. put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line
			// of code)
			Tortoise.setSpeed(6);
			Tortoise.penDown();
			Tortoise.move(100);
			Tortoise.turn(90);
			Tortoise.move(100);
			Tortoise.turn(90);
			Tortoise.move(100);
			Tortoise.turn(90);
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
}
