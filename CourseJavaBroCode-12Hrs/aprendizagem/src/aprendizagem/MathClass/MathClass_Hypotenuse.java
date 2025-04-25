package aprendizagem.MathClass;
import java.util.Scanner;

public class MathClass_Hypotenuse {
	public static void main(String[] args) {
		
		// System.out.println(Math.PI);
		// System.out.println(Math.E);
		
		// double result;
		
		// result = Math.pow(3, 3); 27
		// result = Math.sqrt(9); 3
		// result = Math.abs(-5); 5
		// result = Math.round(3.14); 3
		// result = Math.ceil(3.14); 4
		// result = Math.floor(3.99); 3
		// result = Math.max(10, 20); 20
		// result = Math.min(10, 20); 10
		
		
		// System.out.println(result);
		
		// HYPOTENUSE c = Math.sqrt(a² + b²)

		Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		
		System.out.print("Enter the value of cathet 'a':  ");
		a = scanner.nextDouble();
		System.out.print("Enter the value of cathet 'b':  ");
		b = scanner.nextDouble();
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("The Value of Hypotenuse is: " + c);
		
		
		scanner.close();
	}
}
