import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String o = JOptionPane.showInputDialog("Choose a number");
		String to = JOptionPane.showInputDialog("Choose a number again");
		String tee = JOptionPane.showInputDialog("Choose a number one more time");
		int hi = Integer.parseInt(o);
		int hii = Integer.parseInt(to);
		int hiii = Integer.parseInt(tee);
		if (hi > hii && hi > hiii) {
			JOptionPane.showMessageDialog(null, hi);
			if (hii > hiii) {
				JOptionPane.showMessageDialog(null, hii);
				JOptionPane.showMessageDialog(null, hiii);
			} else if (hii > hiii&&hi>hi) {
				JOptionPane.showMessageDialog(null, hii);
				if (hi > hiii) {
					JOptionPane.showMessageDialog(null, hi);
					JOptionPane.showMessageDialog(null, hiii);
				}
			}

		} else if (hii > hiii && hii > hi) {

		}
	}
}
