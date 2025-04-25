public class  Main {
	public static void main(String[] args) {
	/*
	 * Variable = a reusable container for a value
	 * 			  a variable behaves as if it was the value it contains
	 * 
	 * Primitive = simple value stored directly in memory (stack)
	 * Reference = memory address (stack) that point to the (heap)
	 * Primitive vs Reference
	 * ---------    ----------
	 * int			string 
	 * double		array
	 * char			object
	 * boolean
	 * 
	 * 2 Steps to creating  a variable
	 * -------------------------------
	 * 1. Declaration
	 * 2. assignment 
	 */
	// Declaration and assignment:
	int age = 20;
	int year = 2025;
	int quantity = 1;
	
	double price = 79.99;
	double gpa = 3.5;
	double temperature = -50.5;
	
	char letter = 'A';
	char symbols= '!' ;
	char currency = '$';

	boolean isStudent = true;
	boolean isMurderer = false;
	boolean isOnLine = true;
	
	String name = "Daniel";
	
	System.out.println("Hello, " + name);
	
	
	}
}
