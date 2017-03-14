import javax.swing.JOptionPane;

public class TheRiddler  {
public static void main(String[] args) {
	String greek = JOptionPane.showInputDialog("Pi is a number created by what religion?");
	if (greek.equals("Greek")){
		JOptionPane.showMessageDialog(null,"you are correct");
	}
}
}