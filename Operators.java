import java.util.Scanner;

public class Operators {
	public static void main(String args[]) {
		//Scanner x = new Scanner(System.in);
		//System.out.println();
		//String y = x.nextLine();

		System.out.println();		
		System.out.println("ARITHMETIC OPERATORS");
		float x = 3;
		float y = 2;
		float result;
		System.out.println();
		System.out.println("With float x = 3f and float y = 2f, we get these results: ");

		System.out.println();		
		System.out.print("Addition: ");
		result = x + y;
		System.out.println(x + " + " + y + " = " + result);

		System.out.println();		
		System.out.print("Substraction: ");
		result = x - y;
		System.out.println(x + " - " + y + " = " + result);

		System.out.println();		
		System.out.print("Multiplication: ");
		result = x * y;
		System.out.println(x + " * " + y + " = " + result);

		System.out.println();		
		System.out.print("Division: ");
		result = x / y;
		System.out.println(x + " / " + y + " = " + result);

		System.out.println();		
		System.out.print("Remainer: ");
		result = x % y;
		System.out.println(x + " % " + y + " = " + result);

		System.out.println();		
		System.out.println("UNARY OPERATORS:");
		int uResult = 1;
        	// result is now 1
        	System.out.println("we start with int uResult = " + uResult);

        	uResult--;
        	System.out.println("uResult-- // result is now : " + uResult);

        	uResult++;
        	System.out.println("uResult++ // result is now : " + uResult);

		System.out.println();
		boolean truth = true;
        	System.out.println("we start with: boolean truth = " + truth);
	
        	System.out.println("!truth = " + !truth);

		System.out.println();		
		System.out.println("RELATIONAL OPERATORS:");
		int a = 2;
		int b = 2;
		System.out.println("a = 2, b = 2");

		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));			


		System.out.println();
		System.out.println("LOGICAL OPERATORS:");
		int c = 3;
		int d = 4;
		System.out.println("c = 3, d = 4");
		System.out.println("(c < d) && (d > c) = " + ((c < d) && (d > c)));
		System.out.println("!(c < d) && (d > c) = " + (!(c < d) && (d > c)));
		System.out.println("(c == d) || (d > c) = " + ((c == d) || (d > c)));
		System.out.println("(c < d) ^ (d > c) = " + ((c < d) ^ (d > c)));
		System.out.println();

		System.out.println();
		System.out.println("COMPOUND ASSIGNMENT:");
		int e = 6, f = 7, g = 8, h = 9;
		System.out.println("int e = 6, f = 7, g = 8, h = 9;");
		System.out.println("e += 1; // returns " + (e += 1));
		System.out.println("f -= 3; // returns " + (f -= 3));
		System.out.println("g *= 3; // returns " + (g *= 3));
		System.out.println("h /= 3; // returns " + (h /= 3));
		System.out.println();

		System.out.println();		
		System.out.println("TERNARY OPERATOR:");
		System.out.println("(3 == 2) ? \"3 equals 2\" : \"3 is not equal 2\"; // returns " + ((3 == 2) ? "3 equals 2" : "3 is not equal 2"));
		System.out.println();		

		System.out.println();		
		System.out.println("BITWISE OPERATORS:");
		int number1 = 12;
		int number2 = 9;
		int bitAND;
		int bitOR;
		int bitXOR;

        	System.out.println("The binary number 0000 1100 is in decimal system " + number1);
        	System.out.println("The binary number 0000 1001 is in decimal system " + number2);
		bitAND = number1 & number2;
		System.out.println();
		System.out.println("bitwise AND");
        	System.out.println("number1 & number2 = " + bitAND);
		System.out.println("The decimal number " + bitAND + " is 0000 1000 in the binary system.");
		
		System.out.println();
		System.out.println("bitwise OR");
		bitOR = number1 | number2;
        	System.out.println("number1 | number2 = " + bitOR);
		System.out.println("The decimal number " + bitOR + " is 0000 1101 in the binary system.");

		System.out.println();
		System.out.println("bitwise XOR");
		bitXOR = number1 ^ number2;
        	System.out.println("number1 ^ number2 = " + bitXOR);
		System.out.println("The decimal number " + bitXOR + " is 0000 0101 in the binary system.");

		System.out.println();
		System.out.println("bitwise Complement");
		int bitComplementNumber1 = ~number1;
        	System.out.println("~number1 = " + bitComplementNumber1);
		System.out.println("The decimal number " + bitComplementNumber1 + " is 1111 0011 in the binary system.");

		System.out.println();
		System.out.println("bitwise Shift");
		System.out.println("number1 = 12 (decimal) / 0000 1100 (binary)"); 
		int bitOneShiftToRight = number1 >>1;
        	System.out.println("number1>>1 = " + bitOneShiftToRight + " / 0000 0110");
		int bitTwoShiftToRight = number1 >>2;
        	System.out.println("number1>>2 = " + bitTwoShiftToRight + " / 0000 0011");
		
		int bitOneShiftToLeft = number1 <<1;
        	System.out.println("number1<<1 = " + bitOneShiftToLeft + " / 0001 1000");
		int bitTwoShiftToLeft = number1 <<2;
        	System.out.println("number1<<2 = " + bitTwoShiftToLeft + " / 0000 0011");

	}
}
