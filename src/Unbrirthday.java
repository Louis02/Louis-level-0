import javax.swing.JOptionPane;

public class Unbrirthday {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("whats your name");
		String bday = JOptionPane.showInputDialog(" whats your birthday ex 06/09 format month first and then the day");
		if (bday.equals("01/04")) {
			JOptionPane.showMessageDialog(null,
					"Happy Birthday to you dun dun dun, Happy Birthday to you dun dun dun Happy birthday dear " + name
							+ " Happy birthday to you");

		} else {
			JOptionPane.showMessageDialog(null,
					"Happy Un-Birthday to you dun dun dun, Happy Un-Birthday to you dun dun dun Happy Un-birthday dear "
							+ name + " Happy un-birthday to you");

		}
	}
}
