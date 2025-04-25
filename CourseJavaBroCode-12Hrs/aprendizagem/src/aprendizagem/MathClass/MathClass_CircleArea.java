package aprendizagem.MathClass;
import java.util.Scanner;
public class MathClass_CircleArea {
	public static void main (String[] args) {
		// Area = PI * Math.pow(radius, 2)
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		double area;
		double pi = Math.PI;
		
		System.out.print("Enter the Value of Radius: ");
		radius = scanner.nextDouble();
		
		area = pi *Math.pow(radius, 2);
		
		System.out.println("The Area is: " + area + "cm²");
		
		scanner.close();
	}
} 
