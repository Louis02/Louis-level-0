import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		String s = "Your lucky numbers are";

		for (int i = 0; i < 5; i++) {

			int r = new Random().nextInt(50) + 1;
			s += ", " + r;

		}
		JOptionPane.showMessageDialog(null, s);
	}

}