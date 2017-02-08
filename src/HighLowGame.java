import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(1000);
		// 2. Print out the random variable above
		System.out.println(random);

		// 11. do the following 10 times

		// 1. ask the user for a guess using a pop-up window, and save their
		// response
		String ans = JOptionPane.showInputDialog(null, "enter any number");
		int x = Integer.parseInt(ans);
		// 4. convert the users’ answer to an int (Integer.parseInt(string))
		// 5. if the guess is correct
		for (int i = 0; i < 10; i++) {
			if (x == (random)) {
				// 6. win
				JOptionPane.showMessageDialog(null, "you win");
				i = 11;
			}

			// 7. if the guess is high
			if (x > random) {
				String answe = JOptionPane.showInputDialog("you are too high");
				x = Integer.parseInt(answe);
				// 8. tell them it's too high

			}
			// 9. if the guess is low
			else if (x < random) {
				String answer = JOptionPane.showInputDialog("you are too low");
				x = Integer.parseInt(answer);
				// 12. tell them they lose

			}

		}
		if (x == random) {
			JOptionPane.showMessageDialog(null, "you lose sunny boy");
		}
	}
}