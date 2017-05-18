
// Copyright Wintriss Technesical Schools 2013ul
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		for(int i = 0; i<7;i++){
		
		String qa = JOptionPane.showInputDialog("Is it a weekday?");

		if (qa.equals("yes")) {

			String qb = JOptionPane.showInputDialog("Are you on vacation?");

			if (qb.equals("yes")) {

				String qc = JOptionPane.showInputDialog("Is it a work trip?");

				if (qc.equals("yes")) {

					JOptionPane.showMessageDialog(null, "Get out of bead or you'll get fired");
				}

				else if (qc.equals("no")) {

					JOptionPane.showMessageDialog(null, "Sleep in");
				}

				
			}
			else if (qb.equals("no")) {

				JOptionPane.showMessageDialog(null, "Get up");
			}
		} else if (qa.equals("no")) {

			JOptionPane.showMessageDialog(null, "Sleep in");
		}
		}
		/*
		 * 1 Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}