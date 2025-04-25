package aprendizagem.MathClass;
import java.util.Scanner;
public class MathClass_Circumference {
	public static void main (String[] args) {
		// Circumference = 2 * PI * radius
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		double circumference;
		double pi = Math.PI;
		
		System.out.print("Enter the Value of Radius: ");
		radius = scanner.nextDouble();
		
		circumference = 2 * pi *radius;
		
		System.out.println("The Circumference is: " + circumference + "cm");
		
		scanner.close();
	}
} 
