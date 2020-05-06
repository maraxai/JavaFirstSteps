public class Conditionals {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("CONDITIONALS");
		System.out.println();
		System.out.println("if:");
		System.out.println("Do we need an umbrella for our walk?");
		System.out.println("We create a boolean variable: boolean rain = false;");
		boolean rain = false;
		System.out.println("Create an if-else conditional based on boolean variable: if (rain == true) {} else {}");
		if (rain == true) {
			System.out.println("It is raining, can you bring an umbrella?");
		}
		else {
			System.out.println("It is not raining, let\'s go.");
		}		
		System.out.println();

		System.out.println();
		System.out.println("if/else if/else:");
		System.out.println("What is your favorite number?");
		System.out.println("Create an integer variable number:\n int favoriteNumber = 123");
		int favoriteNumber = 123;
		System.out.println("Create an if/else if/else conditional:\n If () {}\n else if () {}\n else {}");	
		if (favoriteNumber > 5) {
			System.out.println("My favorite number is greater than 5.");
		}
		else if (favoriteNumber == 5) {
			System.out.println("My favorite number is 5.");
		}
		else {
			System.out.println("My favorite number is smaller than 5.");
		}
		System.out.println();

		System.out.println();
		System.out.println("Ternary:");
		System.out.println("Declare and initialize a boolean variable:\n String enoughFood = false;");
		boolean enoughFood = false;
		System.out.println("Declare string variable that holds the answer:\n String answer;");
		String answer = null;
		System.out.println("Create the ternary and assign it to the variable answer:\n answer = (enoughFood  == true) ? \"There is enough food.\" : \"I am hungry.\"");

		answer = (enoughFood  == true) ? "There is enough food." : "I am hungry.";
		System.out.println("answer: " + answer);
		System.out.println();

		System.out.println();
		System.out.println("Switch:");
		System.out.println("Declare and initialize an integer variable that holds the day of the week:\n int dayOfTheWeek = 1;");
		int dayOfTheWeek = 1;
		System.out.println("Declare a string variable that holds the days of the week:\n String day");
		String day;
		System.out.println("Create a switch with the dayOfTheWeek as the argument");
			switch(dayOfTheWeek) {
				case 1:
					day = "Monday";
					break;
				case 2:
					day = "Tuesday";
					break;
				case 3:
					day = "Wednesday";
					break;
				case 4:
					day = "Thursday";
					break;
				case 5:
					day = "Friday";
					break;
				case 6:
					day = "Saturday";
					break;
				case 7:
					day = "Sunday";
					break;
				default:
					day = "No day selected";
					break;
			}
		System.out.println("Print the return of the switch:");
		System.out.println("Day: " + day);
		System.out.println();

	}

}