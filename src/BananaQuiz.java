
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		for (int i = 0;; i++) {
			// 1. ask the user if they like bananas
			String ban = JOptionPane.showInputDialog("Do you like bananas (please answer yes or no");

			// 2. if they say no,
			if (ban.equals("no")) {
				// tell them they are crazy
				JOptionPane.showMessageDialog(null, "you my friend are crazy");
				// and end quiz
				break;

			}
			// 3. if they say yes
			else if (ban.equals("yes")) {
				// ask them what is their favorite hobby
				String ans = JOptionPane.showInputDialog("what is your favorite hobby");
				// show a pop up that says "<your hobby> is much better with bananas!"
				JOptionPane.showMessageDialog(null, ans + " is not better than bananas");
				break;
			}
			// 4. OPTIONAL: if they say something other than “yes” or “no”
			else {
				// show a pop up that says “You are bananas!”
				JOptionPane.showMessageDialog(null, "you didn't answer properly so you are bananas");
			}
		}

	}
}