import javax.swing.JOptionPane;

public class Level0Calculator {
	public static void main(String[] args) {
for(int i = 0; i<4; i ++){
		// 1. Get 2 numbers from the user and convert them to integer.
		String hi = JOptionPane.showInputDialog("Choose one number to use");
		String hii = JOptionPane.showInputDialog("Choose one other number to use");
		int num1 = Integer.parseInt(hi);
		int num2 = Integer.parseInt(hii);
		// 2. Customize pop-up to support add/subtract/multiply/divide
		// operations.
		int o = JOptionPane.showOptionDialog(null, "Choose your methodChoose your method", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "x", "/", "+", "-" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the
		// appropriate operation
		// based on user request.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator
		// operations.

		// 3. Create method for addition operation.
		// Method should create pop-up that shows equation and solution, eg. 45
		// + 25
		// = 70.
		// HINT: use 'static void add(int num1, int num2) { ... }
		if (o == (2)) {
			JOptionPane.showMessageDialog(null, "Your number is " + (num1 + num2));
		}
		// 4. Create similar methods for subtraction, multiplication and
		// division.
		else if (o == (0)) {
			JOptionPane.showMessageDialog(null, "your number is " + (num1 * num2));
		} else if (o == (1)) {
			JOptionPane.showMessageDialog(null, "your number is " + (num1 / num2));
		} else if (o == (3)) {
			JOptionPane.showMessageDialog(null, "your number is " + (num1 - num2));
		}
	}
}
}
