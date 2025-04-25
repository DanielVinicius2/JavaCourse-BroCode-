package aprendizagem;
import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		
		// If Statement = performs a block of code  if its condition is true
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		Boolean isStudent;
		
		System.out.print("What's your name?: ");
		name = scanner.nextLine();
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		System.out.print("Are you a Student? (true or false): ");
		isStudent = scanner.nextBoolean();
		
		// If's : name
		if (name.isEmpty()) {
			System.out.println("Hello Anonymous!");
		}
		else {
			System.out.println("Hello " + name + "!");
		}
		
		// If's : age
		if (age == 0) {
			System.out.println("You are a baby!");	
		}
		else if (age < 0) {
			System.out.println("You havent been born yet!");
		}
		else if (age >= 65) {
			System.out.println("You are a Senior!");
		}
		else if (age >= 18) {
			System.out.println("You are an adult!");
		}
		else {
			System.out.println("You are a child!");
		}
		
		// If's : isStudent
		if (isStudent == true) {
			System.out.println( "And you are a Student!");
		}
		else {
			System.out.println("And you are not a Student!");	
		}
		
		scanner.close();
	}
}
