import javax.swing.JOptionPane;

public class Fiboncci {
	public static void main(String[] args) {
		int h = 1;
int o = 0;
		int y = o + h;
		for (int i = 0; i < 200; i++) {

			 System.out.println((y));
			 o =h;
			 h=y;
			 y=o+h;
		}

	}
}
