package aprendizagem;
import java.util.Scanner;

public class CompoundInterestCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double amountInvested;
		double rate;
		int timesCompounded;
		int years;
		double finalValue;
		
		System.out.print("How much do you want to invest?: ");
		amountInvested = scanner.nextDouble();
		
		System.out.print("What is the rate (in %) of application?: ");
		rate = (scanner.nextDouble() / 100);
		
		System.out.print("How many times are Compounded per year?: ");
		timesCompounded = scanner.nextInt();
		
		System.out.print("How many Years you gonna invest?: ");
		years = scanner.nextInt();
		
		finalValue = amountInvested * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
		
		System.out.printf("You gonna has R$%.2f! ", finalValue);
		scanner.close();
	}
}
