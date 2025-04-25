package aprendizagem;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		
		int numberInt;
		Double numberDouble;
		Boolean isTrue;
		
		numberInt = random.nextInt();
		numberDouble = random.nextDouble();
		isTrue = random.nextBoolean();
		
		System.out.println(numberInt);
		System.out.println(numberDouble);
		System.out.println(isTrue);
	}
}
