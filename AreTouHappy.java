import javax.swing.JOptionPane;

public class AreTouHappy {
	public static void main(String[] args) {
		for (int i = 0; 1 < 5; i++) {
			String firstbranch = JOptionPane.showInputDialog("Are You Happy");
			if (firstbranch.equals("yes")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
			} else if (firstbranch.equals("no")) {
				String second = JOptionPane.showInputDialog("do you want to be happy");
				if (second.equals("yes")) {
					JOptionPane.showMessageDialog(null, "Change something");
				} else if (second.equals("no")) {
					JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
				}
			} else {
				JOptionPane.showMessageDialog(null, "come on, wright yes or no");

			}
		}
	}
}
