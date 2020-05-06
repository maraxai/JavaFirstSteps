public class Methods {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("METHODS");
		System.out.println("Note that the methods are located outside of the main() method within the class.");
		System.out.println();
		System.out.println("Add two numbers and check your result.");
		System.out.println("Provide three arguments to the method checkSum: number1, number2, and result: checkSum(20, 80, 100)"); 
		System.out.println(checkSum(20, 80, 100)); 

		System.out.println();
		System.out.println("Odd numbered words in lower case, even numbered in upper case.");
		System.out.println("upperLower(\"fish\");");
		upperLower("fish");
		System.out.println("upperLower(\"LOL\");");
		upperLower("LOL");
		System.out.println();
	}
	

	public static String checkSum(int num1, int num2, int guess) {
		String result;
		int sum = num1 + num2;
		if (guess == sum) {
			result = "Correct! The sum of " + num1 + " and " + num2 + " equals " + guess;
		}
		else {
			result = "Wrong! The sum of " + num1 + " and " + num2 + " does not equal " + guess + ". Please try again!";
		}
		return result;
	}


	public static String upperLower(String text) {	
		String result;
		int stringLength = text.length();
		if (stringLength % 2 == 0) {
			result = text.toUpperCase();
		}
		else {
			result = text.toLowerCase();
		}
		return result;
	}
}