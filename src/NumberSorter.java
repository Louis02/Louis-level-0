import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String o = JOptionPane.showInputDialog("Choose a number");
		String to = JOptionPane.showInputDialog("Choose a number again");
		String tee = JOptionPane.showInputDialog("Choose a number one more time");
		int one = Integer.parseInt(o);
		int two = Integer.parseInt(to);
		int three = Integer.parseInt(tee);
		if (one < two && one < three) {
			JOptionPane.showMessageDialog(null, one);
			if (two < three) {
				JOptionPane.showMessageDialog(null, two);
				JOptionPane.showMessageDialog(null, three);
			} else if (three < two) {
				JOptionPane.showMessageDialog(null, three);
				JOptionPane.showMessageDialog(null, two);
			}

		} else if (two < three && two < one) {
			JOptionPane.showMessageDialog(null, two);
			if (one > three) {
				JOptionPane.showMessageDialog(null, three);
				JOptionPane.showMessageDialog(null, one);
			} else {
				JOptionPane.showMessageDialog(null, one);
				JOptionPane.showMessageDialog(null, three);
			}

		}

		else {
			JOptionPane.showMessageDialog(null, three);
			if (one < two) {
				JOptionPane.showMessageDialog(null, one);
				JOptionPane.showMessageDialog(null, two);
			} else {
				JOptionPane.showMessageDialog(null, two);
				JOptionPane.showMessageDialog(null, one);
			}
		}
	}
}
