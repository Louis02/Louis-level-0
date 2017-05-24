import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class Unknown {

	public static void main(String[] args) {
		
		Robot cc = new Robot("batman");
		// 3. ask the user what color they would like the Robot to draw
		String col = JOptionPane.showInputDialog("what color would you like the robot to draw?");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (col.equals("red")) {
			cc.setPenColor(Color.red);
			
		} else if (col.equals("blue")) {
			cc.setPenColor(Color.blue);
			
		} else {
			JOptionPane.showMessageDialog(null, "please choose red or blue");
		}
		cc.setPenWidth(10);
		for (int i = 0; i < 4; i++) {

			cc.setSpeed(10);
			cc.penDown();

			cc.move(100);
			cc.turn(90);
		}

		// 1. make the Robot draw a shape
		// 2. set the pen width to 10

	}

}
