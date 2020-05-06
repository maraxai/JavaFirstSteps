import java.util.Arrays;

public class Array {

	public static int[] doubleValues(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		return null;
	}

	public static void printMat(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)  {
				if (i == j) {
					arr[i][j] = 0;
				}
				else if (i < j) {
					arr[i][j] = 1;					
				}
				else {
					arr[i][j] = -1;
				}
			}
    		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)  {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {

		System.out.println();
		System.out.println("ARRAYS"); 
		System.out.println(); 
		System.out.println("One-Dimensional Arrays");
		System.out.println();
		System.out.println("Create an integer array:");
		System.out.println("int[] numberArray = {6,2,8,1,4,3};"); 
		int[] numberArray = {6,2,8,1,4,3};
		System.out.println();

		System.out.println();
		System.out.println("Print the array with a for loop: ");
		for (int i = 0; i < numberArray.length - 1; i++) {
			System.out.println(numberArray[i]);
		}

		System.out.println();
		System.out.println("Print the array with: Arrays.toString(numberArray);");
		System.out.println(Arrays.toString(numberArray)); 

		System.out.println();
		System.out.println("Sort the array elements with : Arrays.sort(numberArray):");
		Arrays.sort(numberArray); 
 		System.out.println(Arrays.toString(numberArray)); 
		
		System.out.println();
		System.out.println("Reverse the order of the array elements: ");
		for (int i = 0; i < numberArray.length/2; i++) {
			int temp = numberArray[i];
			numberArray[i] = numberArray[numberArray.length -i -1];
			numberArray[numberArray.length -i -1] = temp;			
		}
 		System.out.println(Arrays.toString(numberArray)); 

 		System.out.println(); 
		System.out.println("Create a method that doubles the values in the array.");
		int[] doubledValues = doubleValues(numberArray);
		System.out.println(Arrays.toString(numberArray)); 		 
		
		System.out.println();

		System.out.println();
		System.out.println("Create a string array:");
		System.out.println("String[] numberArray = {\"Bo\", \"Mo\", \"Will\", \"Jil\"};"); 
		String[] stringArray = {"Kay", "Zack", "Mo", "Will", "Al"};

		System.out.println();
		System.out.println("Print the array with: Arrays.toString(stringArray);");
		System.out.println(Arrays.toString(stringArray)); 

		System.out.println();
		System.out.println("Sort the array elements with : Arrays.sort(stringArray):");
		Arrays.sort(stringArray); 
 		System.out.println(Arrays.toString(stringArray)); 
		
		System.out.println();
		System.out.println("Reverse the order of the array elements: ");
		for (int i = 0; i < stringArray.length/2; i++) {
			String temp = stringArray[i];
			stringArray[i] = stringArray[stringArray.length -i -1];
			stringArray[stringArray.length -i -1] = temp;			
		}
 		System.out.println(Arrays.toString(stringArray)); 
 		System.out.println(); 

 		System.out.println("Two-Dimensional Arrays"); 
 		System.out.println(); 
		System.out.println("Create a two-dimensional string array:");
		System.out.println("String[][] personArray = {{\"Bob\", \"Miller\"},{\"John\", \"Hall\"}};"); 
		String[][] personArray = { {"Bob", "Miller", "23"}, {"John", "Hall", "44"} };
 		
		System.out.println(); 
		System.out.println("Print the array with: Arrays.deepToString(personArray);");
		System.out.println(Arrays.deepToString(personArray)); 
 		System.out.println(); 

	}

}