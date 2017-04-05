import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
static int pethappy = 0;
	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String pet = JOptionPane.showInputDialog("What pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for(int i = 0; i<3; i++){
int task = JOptionPane.showOptionDialog(null, "What does he want", "hi", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Water", "Food", "Shelter", "People", "Diapers", "His Family" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==(1)){
	two();
}
else if(task==(0)){
	one();
}
else if (task==(2)){
	three();
}
else if (task==(3)){
	four();
}
else if (task==(4)){
	five();
}
else if(task==(5)){
	six();
}
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "your pet happy meter is "+pethappy);
if (pethappy<=(0)){
	JOptionPane.showMessageDialog(null, "Just get rid of your pet.  You aren't not good enough for him");
}
else if(pethappy==(1)){
	JOptionPane.showMessageDialog(null, "Consider going to therapy with it but you will survive together ");
}
else if(pethappy>=(2)){
	JOptionPane.showMessageDialog(null, "You will happily ever after");
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void one  (){
	JOptionPane.showMessageDialog(null, "Good job your pet needs water.  Now it is happy with you:(" );
System.out.println( ( pethappy+=1));
}
static void two (){
	JOptionPane.showMessageDialog(null, "Good job your pet needs food.  Now it is happy with you:(" );
	System.out.println(  (pethappy+=1));
}
static void three(){
	JOptionPane.showMessageDialog(null, "Good hob your pet needs a roof over their heads.  Now it is happy with you:)" );
	System.out.println( ( pethappy+=1));
}
static void four(){
JOptionPane.showMessageDialog(null, "Hiss.  Your pet is not wanting your company at this moment:_(" );	
System.out.println( ( pethappy-=1));
}
static void five(){
	JOptionPane.showMessageDialog(null, "Hiss.  Your pet is grown up and doesn't need to be babied:_(" );
	System.out.println( ( pethappy-=1));
}
static void six(){
	JOptionPane.showMessageDialog(null, "Yaaaay.  Your pet is extremely to have his family with him.  Thanks for tracking them down:)");
	System.out.println( ( pethappy+=2));
}
}
