
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class yhgg {
	public static void main(String[] args) {

		int x = 2017;
		String agge = JOptionPane.showInputDialog("Please put your age at the end of 2017");
		int age = Integer.parseInt(agge);
		System.out.println((x - age));
		if(age>30){
			JOptionPane.showMessageDialog(null, "you are too old to play this game");
		}

	}
}