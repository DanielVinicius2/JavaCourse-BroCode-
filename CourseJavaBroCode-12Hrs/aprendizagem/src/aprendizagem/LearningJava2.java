package aprendizagem;
import java.util.Scanner;

public class LearningJava2 {
	public static void main(String[] args) {
		
		double width = 0;
		double height = 0;
		double area = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert the width: ");
		width = scanner.nextDouble();
		
		System.out.print("Insert the height: ");
		height = scanner.nextDouble();
		
		area = width * height;
		
		System.out.println("The area is: " + area + "cm².");
	
		scanner.close();
	}


}
