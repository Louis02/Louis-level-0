
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickel = JOptionPane.showInputDialog("How many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
		int nickelnum = Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How many dimes");
		int dimenum = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quarter = JOptionPane.showInputDialog("How many quarters");
		int quarternum = Integer.parseInt(quarter);
		// Calculate how much money the user has and save it in a double
		// variable
		double change = (dimenum * .1) + (nickelnum * .05) + (quarternum * .25);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have $" + change);
	}
}
