package calc;

import java.util.Scanner;

/**
 * 
 * @author Alejandro
 * Calculator class that allows users to add, subtract, multiply, divide, and modulo. 
 * This class uses a Scanner and basic conditional controls to maintain the flow of logic.
 */
public class Calculator {
	private String manufacturer = "Skrum Industries";
	private String softwareVersion = "1.0";
	private String model = "Skrumpulator";
	private String yearReleased = "2020";
	
	/**
	 * The main method for this class. It is the only method to be called by a user and will
	 * follow the logical steps to run the program. 
	 */
	public void run()
	{
		boolean end;
		System.out.println(model + " was manufactored by " + manufacturer + ".\nCurrent version: " + softwareVersion
				+ "\nReleased in " + yearReleased);
		Scanner sc = new Scanner(System.in);
		try {
			do
			{
				end = chooseOper(sc);

			} while(!end);
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e);
		}
		finally
		{
			sc.close();
		}
	}
	
	/** 
	 * The primary method for choosing an operation. This method interprets what the user's intention is
	 * and chooses the appropriate operation to apply.
	 * @param sc Scanner object that will be used to take user input.
	 * @return true if the user wants to end the program, returns false if the user opts to do an operation.
	 */
	private boolean chooseOper(Scanner sc)
	{
		System.out.println("\nPlease choose which function you would like to use:");
		System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Modulo\n6) Exit");

		String choice = "";
		boolean end = false;
		
		choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("add") || 
				choice.equalsIgnoreCase("addition") || choice.equals("1") || choice.equals("+"))
			sAdd(sc);
		else if(choice.equalsIgnoreCase("s") || choice.equalsIgnoreCase("sub") || 
				choice.equalsIgnoreCase("subtraction") || choice.equals("2") || choice.equals("-"))
			sSub(sc);
		else if(choice.equalsIgnoreCase("mul") || choice.equalsIgnoreCase("mult") ||
				choice.equalsIgnoreCase("multiplication") ||choice.equals("3") || choice.equals("*"))
			sMult(sc);
		else if(choice.equalsIgnoreCase("d") || choice.equalsIgnoreCase("div") ||
				choice.equalsIgnoreCase("division") || choice.equals("4") || choice.equals("/"))
			sDiv(sc);
		else if(choice.equalsIgnoreCase("mod") || choice.equalsIgnoreCase("modulo") ||
				choice.equals("5") || choice.equals("%"))
			sMod(sc);
		else if(choice.equalsIgnoreCase("e") || choice.equalsIgnoreCase("exit") || 
				choice.equals("6"))
			end = true;
		else
		{
			System.out.println("Your entry was invalid. Please enter a valid input.");
			choice = "-1";
		}

		return end;
	}
	
	/**
	 * This method requests a number from the user, it ensures that the number correctly input, and 
	 * returns said number back to the calling method.
	 * @param sc Scanner used to take user input.
	 * @param prompt The prompt for which number the user is entering.
	 * @return the valid number that the user input.
	 * Precondition: Scanner sc is a valid Scanner and the prompt is a non-null String.
	 * Postcondition: The user's number is taken and returned to the calling method.
	 */
	private double enterNum(Scanner sc, String prompt)
	{
		double num = 0;
		String in = "";
		boolean valid = false;
		do
		{
			System.out.println("Enter " + prompt);
			try 
			{
				in = sc.nextLine();
				num = Integer.valueOf(in);
//				num = sc.nextDouble();
				valid = true;
			}
			catch(Exception e)
			{
				System.out.println("Error: Please enter a real number.");
			}
		} while(!valid);
		return  num;
	}

	/**
	 * Helper method that collects the numbers that will be added and prints the sum to 
	 * the console.
	 * @param sc Scanner used to take user input.
	 */
	private void sAdd(Scanner sc)
	{
		double num1 = enterNum(sc, "first number");
		double num2 = enterNum(sc, "second number");
		System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
	}
	
	/**
	 * Helper method that collects the numbers that will be subtracted and prints the difference to 
	 * the console.
	 * @param sc Scanner used to take user input.
	 */
	private void sSub(Scanner sc)
	{
		double num1 = enterNum(sc, "first number");
		double num2 = enterNum(sc, "second number");
		System.out.println(num1 + " - " + num2 + " = " + sub(num1,num2));
	}
	
	/**
	 * Helper method that collects the numbers that will be multiplied and prints the product to 
	 * the console.
	 * @param sc Scanner used to take user input.
	 */
	private void sMult(Scanner sc)
	{
		double num1 = enterNum(sc, "first number");
		double num2 = enterNum(sc, "second number");
		System.out.println(num1 + " * " + num2 + " = " + mult(num1,num2));
	}
	
	/**
	 * Helper method that collects the numbers that will be divided and prints the quotient to 
	 * the console.
	 * @param sc Scanner used to take user input.
	 */
	private void sDiv(Scanner sc)
	{
		double num1 = enterNum(sc, "numerator");
		double num2 = enterNum(sc, "denominator");
		System.out.println(num1 + " / " + num2 + " = " + div(num1,num2));
	}
	
	/**
	 * Helper method that collects the numbers that will be modded and prints the remainder to 
	 * the console.
	 * @param sc Scanner used to take user input.
	 */
	private void sMod(Scanner sc)
	{
		double num1 = enterNum(sc, "first");
		double num2 = enterNum(sc, "second");
		System.out.println(num1 + " % " + num2 + " = " + mod(num1,num2));
	}
	
	/**
	 * Basic adding method. Adds the args and returns the sum.
	 * @param num1 First number to be added.
	 * @param num2 Second number to be added.
	 * @return the sum of num1 plus num2.
	 * Precondition: parameters are real numbers.
	 * Postcondition: parameters will be added and returned.
	 */
	private double add(double num1, double num2)
	{
		return num1 + num2;
	}
	
	/**
	 * Basic subtracting method. Subtracts the args and returns the difference.
	 * @param num1 First number to be subtracted.
	 * @param num2 Second number to be subtracted.
	 * @return the difference of num1 minus num2.
	 * Precondition: parameters are real numbers.
	 * Postcondition: parameters will be subtracted and returned.
	 */
	private double sub(double num1, double num2)
	{
		return num1 - num2;
	}
	
	/**
	 * Basic multiplying method. Multiplies the args and returns the product.
	 * @param num1 First number to be multiplied.
	 * @param num2 Second number to be multiplied.
	 * @return the product of num1 times num2.
	 * Precondition: parameters are real numbers.
	 * Postcondition: parameters will be multiplied and returned.
	 */
	private double mult(double num1, double num2)
	{
		return num1 * num2;
	}
	
	/**
	 * Basic dividing method. Divides the args and returns the quotient.
	 * @param num1 numerator which will be divided.
	 * @param num2 divisor to the numerator(denominator).
	 * @return the quotient of num1 divided by num2.
	 * Precondition: parameters are real numbers.
	 * Postcondition: parameters will be divided and returned.
	 */
	private double div(double num1, double num2)
	{
		return num1 / num2;
	}
	
	/**
	 * Basic modulo method. Divides the args and returns the remainder.
	 * @param num1 numerator which will be divided.
	 * @param num2 divisor to the numerator(denominator).
	 * @return the remainder of num1 divided by num2.
	 * Precondition: parameters are real numbers.
	 * Postcondition: parameters will be divided and the remainder will be returned.
	 */
	private double mod(double num1, double num2)
	{
		return num1 % num2;
	}
}
