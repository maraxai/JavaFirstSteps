import java.util.Scanner;

public class Strings {
	public static void main(String args[]) {

	System.out.println("STRING MUTATION");
	System.out.println();
	System.out.println("Concatenate");
	String greeting = "Hello!";
	System.out.println("We have: String greeting = \"Hello!\"");
	String question = "How are you?";
	System.out.println("We have: String question = \"How are you?\"");
	System.out.println("We concatenate greeting + question");
	System.out.println(greeting + " " + question);
	System.out.println();
	System.out.println("Concatenate a number with a string.");
	int number = 8;
	System.out.println("int number = 8;");
	System.out.println(8 + ", " + question);
	System.out.println();

	System.out.println();
	System.out.println("Check for Equality");
	System.out.println("greeting.equals(question)");
	System.out.println("The compared strings are equal: " + greeting.equals(question));
	System.out.println();

	System.out.println();
	System.out.println("Split a string");
	String offerCoffee = "Do you want a coffee?";
	System.out.println("String offerCoffee = \"Do you want a coffee?\" ");
	String[] offerCoffeeArray = offerCoffee.split(" ");
	System.out.println("String[] offerCoffeeArray = offerCoffee.split(\" \");");
	System.out.println("Get array elements by index-reference in object notation.");
	System.out.println("offerCoffeeArray[0] : " + offerCoffeeArray[0]);
	System.out.println("offerCoffeeArray[1] : " + offerCoffeeArray[1]);
	System.out.println("offerCoffeeArray[2] : " + offerCoffeeArray[2]);
	System.out.println("offerCoffeeArray[3] : " + offerCoffeeArray[3]);
	System.out.println("offerCoffeeArray[4] : " + offerCoffeeArray[4]);
	System.out.println();

	System.out.println();
	System.out.println("Substring");
	System.out.println("with 1 parameter (start to end of string):");
	System.out.println("String longestWord = \"pneumonoultramicroscopicsilicovolcanoconiosis\";");
	String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
	System.out.println("String endOfWord = longestWord.substring(30);");
	String endOfWord = longestWord.substring(30);
	System.out.println("endOfWord = " + endOfWord);
	System.out.println();
	System.out.println("with 2 parameter (start and end):");
	System.out.println("String endOfWord = longestWord.substring(30);");
	String partOfWord = longestWord.substring(8, 24);
	System.out.println("partOfWord = " + partOfWord);
	System.out.println();

	System.out.println();
	System.out.println("toUpperCase");
	String upperCase = longestWord.toUpperCase();
	System.out.println("String upperCase = longestWord.toUpperCase();");
	System.out.println(upperCase);
	System.out.println();

	System.out.println();
	System.out.println("length()");
	int lengthString = longestWord.length();
	System.out.println("String lengthString = longestWord.length();");
	System.out.println("The length of the string is: " + lengthString + " characters.");
	System.out.println();

	System.out.println();
	System.out.println("Trim the beginning and the end of a string of whitespaces:");
	String needsToBeTrimmed = "   text    ";
	System.out.println("String needsToBeTrimmed = \"   text    \";");
	System.out.println(needsToBeTrimmed);
	String trimmed = needsToBeTrimmed.trim();
	System.out.println("String trimmed = needsToBeTrimmed.trim();");
	System.out.println("\"" + trimmed + "\"");
	System.out.println(longestWord.hashCode());

	}
}
