
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Louis = "Time Control";
		String Tom = "Shape Shifting";
		String Aryahi = "Illusion";
		String Wendy = "Mind Control";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		for(int i = 0; i<10; i++){
		String name = JOptionPane.showInputDialog("what is your name");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Louis")) {
JOptionPane.showMessageDialog(null, "You have " + Louis);


		}
	
	else if(name.equals("Tom")){
		JOptionPane.showMessageDialog(null, "You have " + Tom);
	}
	else if (name.equals("Aryahi")){
		JOptionPane.showMessageDialog(null, "You have " + Aryahi);
	}
	else if (name.equals("Wendy")){
		JOptionPane.showMessageDialog(null, "You have " + Wendy);
	}
		}
}
}
