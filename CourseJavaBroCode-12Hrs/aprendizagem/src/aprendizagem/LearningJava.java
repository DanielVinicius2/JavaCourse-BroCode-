package aprendizagem;
import java.util.Scanner;

public class LearningJava {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
			
		System.out.print("What is your GPA? ");
		Double gpa = scanner.nextDouble();
		
		System.out.print("Are you a Student?(true or false)");
		boolean isStudent = scanner.nextBoolean();
		
		System.out.println("Hello, " + name +" you are " + age + " years old");
		System.out.println("Your GPA is: " + gpa );
		
		if (isStudent) {
			System.out.println("You are enrolled as a student ");
		}
		else {
			System.out.println("You are not enrolled!!");
		}
		scanner.close();
	}
}
