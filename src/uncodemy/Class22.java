package uncodemy;

import java.io.IOException;

public class Class22 {

	public static void main(String[] args) {
		char choice = 0; 
		System.out.println("Help on:"); 
		System.out.println(" 1. if");
		System.out.println(" 2. switch"); 
		System.out.print("Choose one: "); 
		try {
			choice = (char) 
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n"); 
		switch(choice) 
		{
		case '1':

		System.out.println("The if:\n"); 
		System.out.println("if(condition) statement;");
		System.out.println("else statement;");
		break; 
		case '2':
		System.out.println("The switch:\n"); System.out.println("switch(expression) {"); 
		System.out.println(" case constant:"); System.out.println(" statement sequence"); 
		System.out.println(" break;"); System.out.println(" // ...");
		System.out.println("}"); break;
		default:

		System.out.print("Selection not found.");

		}
	}

}
