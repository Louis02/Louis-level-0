
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {

		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
		for (int p = 0; p < 7; p++) {

			String ans = JOptionPane.showInputDialog("What do you want a triangle, square or a pentagon");
			Tortoise.setSpeed(10);
			Tortoise.penDown();
			// 5. Set the number of sides depending on what the user entered
			// (multiple lines of code)
			if (ans.equals("triangle")) {
				for (int i = 0; i < 20; i++) {
					Tortoise.move(i * 3);
					Tortoise.turn(360 / 3);

				}
			} else if (ans.equals("square")) {
				for (int a = 0; a < 20; a++) {
					Tortoise.move(a * 3);
					Tortoise.turn(360 / 4);
				}
			} else if (ans.equals("pentagon")) {
				for (int w = 0; w < 20; w++) {
					Tortoise.move(w * 3);
					Tortoise.turn(360 / 5);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Please answer exactly as I repeat: triangle, square, pentagon");

				// 6. If the user enters something else, say "Sorry, I don't
				// know how to draw a ..."

				// 1. Make the Tortoise draw a square spiral shape. If you get
				// stuck, use these instructions: http://bit.ly/YJUOkn

				// 2. Change your code to turn the square spiral into a triangle
				// spiral

			}

		}
	}
}
