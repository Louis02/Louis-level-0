import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
for(int i=0; i<20; i++){
		// 1. Adjust this pop-up to find out what mood the user is in.
		int ElonComp = JOptionPane.showOptionDialog(null, "What is your favorite Elon Musk company", "Company Question",
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Tesla", "SpaceX", "PayPal" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		if (ElonComp == (0)) {
			JOptionPane.showMessageDialog(null, "you chose Tesla");

			int ans = JOptionPane.showOptionDialog(null, "what is the name of one of the founders", "Quiz", 0,
					JOptionPane.QUESTION_MESSAGE, null, new String[] { "Micheal", "Mason", "Mark" }, null);
			if (ans == (0)) {
				JOptionPane.showMessageDialog(null, "you are wrong");
			continue;
			} else if (ans == (1)) {
				JOptionPane.showMessageDialog(null, "you are wrong");
				continue;
			} else if (ans == (2)) {
				JOptionPane.showMessageDialog(null,
						"you are right the orginal people are Marc Tarpening and Martin Eberhead, Elon invested and took over");
			continue;
			}
		} else if (ElonComp == (1)) {
			JOptionPane.showMessageDialog(null, "you chose SpaceX");
			int ans2 = JOptionPane.showOptionDialog(null, "Wich rocket can be reused", "SpaceX Question", 0,
					JOptionPane.QUESTION_MESSAGE, null, new String[] { "None of them", "Grasshoppper", "Reusarocket" },
					null);
			if (ans2 == (0)) {
JOptionPane.showMessageDialog(null, "You are wrong");
			continue;
			}
			else if(ans2 == (1)){
				JOptionPane.showMessageDialog(null, "Correctamondo it can land and go back after being cleaned");
			continue;
			}
			else if (ans2 == (2)){
				JOptionPane.showMessageDialog(null, "Wrong");
				continue;
			}

		} else if (ElonComp == (2)) {
			JOptionPane.showMessageDialog(null, "you chose PayPal");
int ans3 = JOptionPane.showOptionDialog(null, "Did Elon get kicked out of this company", "PayPal Question", 0,
		JOptionPane.QUESTION_MESSAGE, null, new String[]{ "Yes", "No"}, null);
if(ans3==(0)){
	JOptionPane.showMessageDialog(null, "Yes he did");
	continue;
}
JOptionPane.showMessageDialog(null, "no");
continue;
		}
		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.

		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install
		// Adblock.
}
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
