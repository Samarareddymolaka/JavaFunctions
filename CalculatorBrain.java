package practiceJava.Functions;


	import java.util.Scanner;

	/*
	 * Create a new Java class that will have the following functionality:

	Name should be CalculatorBrain
	Implement a function for each aritmetic operation
	Addition
	Subtraction
	Multiplication
	Division
	Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.
	Challenge yourself
	Add some more functionality to your CalculatorBrain:

	Square Root
	Power Of
	 */
	public class CalculatorBrain {
		  public static int addition(int a, int b) {
		        return a + b;
		    }

		    public static int subtraction(int a, int b) {
		        return a - b;
		    }

		    public static int multiplication(int a, int b) {
		        return a * b;
		    }

		    public static double division(int a, int b) {
		        if (b == 0) {
		            throw new ArithmeticException("Cannot divide by zero");
		        }
		        return (double) a / b;
		    }

		    public static double squareRoot(int a) {
		        return Math.sqrt(a);
		    }

		    public static double powerOf(int base, int exponent) {
		        return Math.pow(base, exponent);
		    }
			public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 System.out.println("Addition: " + addition(num1, num2));
	     System.out.println("Subtraction: " + subtraction(num1, num2));
	     System.out.println("Multiplication: " + multiplication(num1, num2));
	     try {
	         System.out.println("Division: " + division(num1, num2));
	     } catch (ArithmeticException e) {
	         System.out.println(e.getMessage());
	     }

	     int number = 25;
	     System.out.println("Square Root of " + number + ": " + squareRoot(number));

	     int base = 2;
	     int exponent = 3;
	     System.out.println(base + " raised to the power of " + exponent + ": " + powerOf(base, exponent));
	     sc.close();
	 }
	}





