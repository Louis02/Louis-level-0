import javax.swing.JOptionPane;

public class MethodMaker {
	void go() {
		// 2. Call the method created in step 1
		youRock();
		// 4. Call the method you created in step 3 with an int parameter that tells 
		//    how old you will be by the end of this year
		age(13);
		// 6. Call the method created in step 5 with a String and an int parameter
		numlet("hhhtfuyrcfuicfegbuyecfguyecfqgyufecqyufiewybufwquefqwygefwyfcwebfygubefqwbgyuefyubgefybugfuybgeefwgbuefbcgi", 9);
		// 8. Call the method created in step 7 with 2 integers, multiply these numbers and display the result.
m(5,5 );
	}

	// 1. Create a method that asks the user's name and says they ROCK!
	//    Hint: void yourMethodName() {   
	//          }
void youRock (){
	String name = JOptionPane.showInputDialog("What's your name");
	JOptionPane.showMessageDialog(null, name +" rocks");
}
	
	// 3. Create a method that has an int parameter for how old you will be by the end of this year, 
	//    and creates a pop-up that tells you what year you were born.
	//    Hint: void yourMethodName(int age) {    
	//          }
void age (int agee){
	JOptionPane.showMessageDialog(null, "you were born in " + (2017-agee) + "!");
}
	
	// 5. Create a method with a String parameter and an int parameter "numTimes" which
	//    prints the String parameter "numTimes".
	//    No more hints for creating methods! 
	//         Copy what you did in steps 1 & 3, but with different parameter types.
void numlet(String num, int let){
	for(int i = 0; i < let; i ++){
	System.out.println(num);
	}
}
	
	// 7. Create a method that multiplies 2 numbers that are passed in as parameters
	//    and displays the results in a pop-up.
void m (int e, int ee){
	JOptionPane.showMessageDialog (null, "thy answer is " + (e*ee));
}

	public static void main(String[] args) {
		new MethodMaker().go();
	}
}
