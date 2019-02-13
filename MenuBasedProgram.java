

import java.util.Scanner;
public class MenuBasedProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variables
		int choice;
		
		//do while loop
		do{
		
		//Create a Menu
		System.out.println("1. Find a String. ");
		System.out.println("2. Replace the found String to another. ");
		System.out.println("3. Find all incidents of a String. ");
		System.out.println("4. Replace all incidents of a String to another one");
		System.out.println("5. Exit");
		System.out.print("\n     Enter your choice: "); //  ( \n = new line )
		
		//obtain the user's choice
		choice = input.nextInt();
		
		// process the user's choice
		switch (choice){
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			System.out.println("Wrong Choice! Select valid Choice!!!");
		}
		
		
		} while (choice != 5); // || choice > 0 && choice < 5);
		
		
		

	}

}
