package aprendizagem;

public class StringMethods {
	public static void main(String[] args){
		String name ="Password";
		/*
		int length = name.length();
		char letter = name.charAt(0);
		int index = name.indexOf(" ");
		int lastIndex = name.lastIndexOf("i");
		
		 name = name.toUpperCase();
		 name = name.toLowerCase();
		 name = name.trim();
		 name = name.replace("i","y");
		*/
		
		/*
		if(name.isEmpty()) {
			System.out.println("Your name is Empty \n");	
		}
		else {
			System.out.printf("Hello %s", name);
			
		}
		*/
		/*
		if(name.contains(" ")) {
			System.out.println("Your name contains space ");
		}
		else {
			System.out.println("Your name DOESN'T contain any sapace");
		}
		*/
		if (name.equalsIgnoreCase("Password")) {
			System.out.println("Your name can't be password!");
		}
		else {
			System.out.printf("\n Hello %s",name);
		}
	
	}
	
	
}
