package aprendizagem;
import java.util.Scanner;

public class MadLibsGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String adjective1;
		String noun;
		String adjective2;
		String verb;
		String adjective3;
	
		System.out.print("Enter an adjective (description): ");
		adjective1 = scanner.nextLine();
		System.out.print("Enter a noun (animal or person): ");
		noun = scanner.nextLine();
		System.out.print("Enter an adjective (description): ");
		adjective2 = scanner.nextLine();
		System.out.print("Enter a verb end with -ing (action): ");
		verb = scanner.nextLine();
		System.out.print("Enter an adjective (description): ");
		adjective3 = scanner.nextLine();
		
		
		System.out.print("Today I went to a " + adjective1 + " zoo. ");
		System.out.print("In a exhibt, I saw a " + noun + ". ");
		System.out.print(noun+" was " + adjective2 + " and " + verb + "! ");
		System.out.print("I was " + adjective3 + "!");
	
		scanner.close();
	}

}
