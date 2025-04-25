package aprendizagem.MathClass;
import java.util.Scanner;
public class MathClass_SphereVolume {
	public static void main (String[] args) {
		// Area = PI * Math.pow(radius, 2)
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		double volume;
		double pi = Math.PI;
		
		System.out.print("Enter the Value of Radius: ");
		radius = scanner.nextDouble();
		
		volume = 4/3 * pi * Math.pow(radius, 3);
		
		System.out.printf("The volume is: %.1fcm³", volume);
		
		scanner.close();
	}
} 
