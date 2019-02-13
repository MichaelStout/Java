import java.util.Scanner;
public class displayMenu {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a choice from menu: ");
		
		char b;
		
		do{
			b = displayMenu();
			
			switch(b){
		case 'A': System.out.println("A. Enter a new Main Sentence");
				  A();
			break;
		
		case 'B':System.out.println("B. Find a String");
			break;
		
		case 'C':System.out.println("C. Find all Incidents of a String");
			break;
		
		case 'D':System.out.println("D. Find and Replace a String");
			break;
		
		case 'E':System.out.println("E. Exit");
			break;
		
		default: System.out.println("Invalid Choice!");
				
			}
			} 
			while ( b != 'E');		
	}	
	
	public static char displayMenu(){
		Scanner bob = new Scanner(System.in);
		do{
		System.out.println("A. Enter a new Main Sentence");
		System.out.println("B. Find a String");
		System.out.println("C. Find all Incidents of a String");
		System.out.println("D. Find and Replace a String");
		System.out.println("E. Exit");
		
		char choice = bob.next().charAt(0);
		return choice;
		
		}while(isValidInput('A', 'B', 'C', 'D', 'E'));
		
		
}
	public static boolean isValidInput(char A, char B, char C, char D, char E){
		Scanner bob = new Scanner(System.in);
		boolean valid;
		char choice = bob.next().charAt(0);
		if (choice == A || choice == B || choice == C || choice == D || choice == E){
			valid = true;
		}else{
			valid = !true;
		}
		return valid;
	}
	public static String A(){
		Scanner bob = new Scanner(System.in);
		System.out.println("PLease enter a new main sentence: ");
		String A = bob.nextLine();
		return A;
	}
	
	
	
}

	
	

