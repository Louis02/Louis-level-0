
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			// 1. Watch the first 2 minutes of this movie:
			// http://vimeo.com/2485018
			int r = new Random().nextInt(4);
			// 2. On paper, write all the numbers that get printed when you run
			// this
			// class
			// 0,1,2,3,4
			// 3. Use the randomNumber to give the user a random compliment.

			if (r == 0) {
				JOptionPane.showMessageDialog(null, "You are awesome");
			} else if (r == 1) {
				JOptionPane.showMessageDialog(null, "I like you, you are nice");
			} else if (r == 2) {
				JOptionPane.showMessageDialog(null, "You are a good coder");
				
			}
			else if (r==3){
				JOptionPane.showMessageDialog(null, "You are the best");
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
