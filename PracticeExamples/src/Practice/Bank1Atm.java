package Practice;

import java.util.Scanner;

public class Bank1Atm 
{	
	int PIN;
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		System.out.println("Please swipe ur card");
	
		int attempt=1;
		boolean ProceedAhead=false;
				
		while (attempt<4 && !ProceedAhead)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ur PIN " + attempt + " attempt");	
		attempt++;
		int PIN=scan.nextInt();
		if (PIN == 1234 && !ProceedAhead)
		{
			System.out.println("Please proceed ahead");
			ProceedAhead=true;
		}
		else
		{
			System.out.println("OOPS!! Incorrect PIN, Please try again");
		}
	}
		
	if (!ProceedAhead)
	{
		System.out.println("You had exceeeded 3 login attempts");
	}
		
	}
	
	
}


