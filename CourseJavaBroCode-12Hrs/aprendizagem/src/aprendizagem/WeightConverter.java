package aprendizagem;
import java.util.Scanner;
public class WeightConverter {
	public static void main(String[] args) {
		
		// WEIGHT CONVERSION PROGRAM
		Scanner sc = new Scanner( System.in);		
		
		// DECLARE VARIABLES
		int option;
		double weight;
		
		// WELCOME MESSAGE
		System.out.println("Weight Convertor!");
		
		// PROMPT FOR USER CHOICe
		System.out.print(""
				+ "Choose what option do you want: \n"
				+ "1: Lbs to Kgs \n"
				+ "2: Kgs to Lbs \n"
				+ "");
		option = sc.nextInt();
		
		// OPTION 1 CONVERT LBS TO KGS
		if (option == 1 ) {
			System.out.print("Weight: ");
			weight = sc.nextDouble();
			weight *= 0.45; 
			System.out.printf("%.2f", weight);
		}
		
		// OPTION 2 CONVERT KGS TO LBS
		else if (option == 2){
			System.out.print("Weight: ");
			weight = sc.nextDouble();
			weight *= 2.2;
			System.out.printf("%.2f", weight);
		}
		
		// ELSE PRINT NOT A VALID CHOICE
		else {
			System.out.println("Choose a valid option");
		}
		
		sc.close();
	}
}