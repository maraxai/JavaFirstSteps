public class Loops {

	public static void main(String[] args) {

		System.out.println("LOOPS");
		System.out.println();
		System.out.println("While Loop");
		System.out.println("Declare and initialize an integer variable:\n int number = 0");
		int number = 0;
		System.out.println("Create a while loop that runs starting at 0 that will run until 2.");
		while(number < 2) {
			number++;
			System.out.println("This is number " + number);
		}
		System.out.println("Note: the first number is 0 and gets incremented to 1. The last number is 2 and gets incremented to 3.");
		System.out.println();

		System.out.println();
		System.out.println("Do While Loop:");
		System.out.println("While a while-loop would not execute this code, a do-while does.");
		System.out.println("With the variable doWhileNumber = 5 and the condition doWhileNumber < 2: ");
		int doWhileNumber = 5;
		do {
			doWhileNumber++;
			System.out.println("This is number " + doWhileNumber);
		}
		while(doWhileNumber <= 2); 
		System.out.println();

		System.out.println();
		System.out.println("For Loop:");
		System.out.println("Initialize the counting variable with value 3.");
		System.out.println("Set the condition that the counting variable cannot be greater than 0");
		System.out.println("Decrement the counting variable");

		System.out.println("for (int i = 3; i > 0; i--)");
		for (int i = 3; i > 0; i--) {
			System.out.println("on the count of " + i);
		}
		System.out.println("GO"); 
		System.out.println();

		System.out.println();
		System.out.println("If Condition in Loop:");
		System.out.println("Print 1 for odd and 0 for even indeces");
		for (int index = 0; index < 8; index++) {
			if (index % 2 == 0) {
				System.out.print("0");
			} 
			else {
				System.out.print("1");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Nested For Loops:");
		System.out.println("Print a checker board with O and X");
		System.out.println("Declare and initialize two variables for the rows and the columns:");
		System.out.println(" int rows = 8\n int columns = 8");
		System.out.println("Create an outer loop for the rows:");
		System.out.println(" for (int i = 1; i <= rows; i++)");
		System.out.println("Create an inner loop for the columns:");
		System.out.println(" for (int j = 1; j <= columns; j++)");
		System.out.println();
			int rows = 8;
			int columns = 8;
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= columns; j++) {
					if ( (i + j) % 2 == 0) {
						System.out.print("X ");	
					}
					else {
						System.out.print("O ");
					}			
				}
			System.out.println();
			}
		System.out.println();

	}
}