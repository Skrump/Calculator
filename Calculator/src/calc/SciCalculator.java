package calc;

import java.util.Scanner;

public class SciCalculator extends Calculator{
	private String softwareVersion = "2.0";
	private String model = "SciSkrumpulator";
	public void run()
	{
		boolean end;
		System.out.println(model + " was manufactured by " + manufacturer + ".\nCurrent version: " + softwareVersion
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

	private boolean chooseAdvOper(Scanner sc)
	{
		System.out.println("Good job");
		return true;
	}
	
	private double sin()
	{
		return -1;
	}
	
	private double cos()
	{
		return -1;
	}
	
	private double tan()
	{
		return -1;
	}
	
	private double log()
	{
		return -1;
	}
	
	private double ln()
	{
		return -1;
	}
	
	private double pow()
	{
		return -1;
	}
	
	private double sqrt()
	{
		return -1;
	}
	
	private double fact()
	{
		return -1;
	}
}
