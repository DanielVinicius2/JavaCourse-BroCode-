package aprendizagem;

public class AboutPrintf_pt2 {
	public static void main(String[] args) {
		// printf() = is a method used to format output
		
		// %[flags][width][.precision][specified-character]
		// %s = String; %c = Char; %d = int
		// %f = double; %b = boolean
		
		//[flags]:													|[width]
		// %.{number}f = decimal places who u want!					|0 = zero padding 
		// + = output plus											|number = right justified padding
		// , = comma grouping separator								|negative number = left justified padding
		// ( = negative numbers are enclosed in ()					|
		// space = display a minus if negative, space if positive	|
		//															|
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// About [flags]:
		
		double price1 = 9.99;         							          
		double price2 = 100.15;									
		double price3 = -54.01;                                  
		
		System.out.printf("%f\n", price1);
		System.out.printf("%f\n", price2);
		System.out.printf("%f\n", price3); // Code ends in this line!
		System.out.println("");
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// About [width]:
		
		int id1 = 1;
		int id2 = 23;
		int id3	= 456;
		int id4	= 7890;
		
		System.out.printf("%d \n", id1);
		System.out.printf("%d \n", id2);
		System.out.printf("%d \n", id3);
		System.out.printf("%d \n", id4); // Code ends in this line!
	}
}
