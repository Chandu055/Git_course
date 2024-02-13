package Practice;

import java.util.Scanner;
	
public class Fibonacci 
{
	public static void main(String[] args) 
	{
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Kindly enter n value upto which fibonacci series is needed");
	int n=scan.nextInt();
	
	int m=0;
	int p=1;
	
	System.out.println("Fibonocci series upto " + n + " numbers");
	for(int i=0; i<n; i++)
	{	
		System.out.print(m + " ");
		int result= m+p;
	    m=p;
	    p=result;
	
     }	
	
	}
			

}


