import java.util.Scanner;

public class Input {
	public static void main(String args[]) {

	// create a scanner object
	Scanner inputName = new Scanner(System.in);

	// create an output that asks for the name
	System.out.println("What is your name?");

	// store the user input into a new variable, 
	// nextLine() returns all tokens with the whitespaces in between
	String userName = inputName.next();

	// output the stored variable
	System.out.println("Hi " + userName + ", how are you?");
	
	}
}
