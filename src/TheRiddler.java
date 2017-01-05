import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String ans = JOptionPane.showInputDialog("What has no hinges, Has no key But holds golden treasure inside?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (ans.equals("egg")) {
			JOptionPane.showMessageDialog(null, "Hooray you got it correct");
			score += 10;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "tsk tsk tsk the answer is egg");
			score -= 5;
		}

		// 6. Add some more riddles
		ans = JOptionPane.showInputDialog(
				"Poor people have it, Rich People want it, It's more evil than the devil, and more powerful than god, if you eat to much of it you die");

		if (ans.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "good job!!!!!!!!");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, "to bad");
			score -= 5;
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "and youre score is " + score);

	}
}
