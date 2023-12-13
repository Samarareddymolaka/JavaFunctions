package practiceJava.Functions;

import java.util.Scanner;

public class Functions {


	public static void main(String[] args) {
		
		        Scanner sc = new Scanner( System.in );
		        System.out.println( "Enter your name:  " );
		        String firstName = sc.next();
		        printNameCharacters( firstName );
		        printNameLength( firstName );
		        System.out.println("Enter your last name: ");
		        String lastName = sc.next();

		        printFullName(firstName, lastName);
		        
		        sc.close();
		    }

		    

			public static void printNameLength( String name )
		    {
		        //TODO implement this code
				 System.out.println("Length of the name: " + name.length());
		    }

		    public static void printNameCharacters( String name )
		    {
		        //TODO implement this code
		    	System.out.println("Characters in the name:");
		        for (char c : name.toCharArray()) {
		            System.out.print(c + " ");
		        }
		        System.out.println();
		    }
		    public static void printFullName(String firstName, String lastName) {
				// TODO Auto-generated method stub
				    	 System.out.println("Full Name: " + firstName + " " + lastName);
			}
}



