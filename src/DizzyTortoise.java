import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		// that number of times.
		String answer = JOptionPane.showInputDialog(null, "how dizzy 1-10");
		int x = Integer.parseInt(answer);
		// 1. Use the dance method to make the Tortoise spin.
		if (x == (10)) {
			dance(10);
		} else if (x >= 7 && x <= 9) {
			dance(8);
		} else if (x >= 1 && x <= 6) {
			dance(4);
		}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
