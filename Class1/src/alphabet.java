
public class alphabet {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("Alphabet A");
		
		int n=5;
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<=4; j++)
			{
				if ((i==0 && (0<j && j<n-1)) ||(i==(n-1)/2) || ((0<i && i<=n) && (j==0 || j==4)))
					
				System.out.print("*");	
				
				else 
					
					System.out.print(" ");	
			}
			System.out.println(" ");
		}
		
	}

}

