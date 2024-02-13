
public class Chandu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" ");	
		System.out.println(" ");	
		
		int n=8;
		for (int i=0; i<n; i++)
			// To print letter "C"
		{
			for (int j=0; j<n; j++)
				{
				if (j==0 && i!=0 && i!=(n-1) || i==0 && j!=0 || i==(n-1) && j!=0)
					
				  System.out.print("*");
				else
					System.out.print(" ");	
				}
			
			System.out.print(" ");	
			System.out.print(" ");	
			
			// To print letter "H"
			for (int h=0; h<n; h++)
			{
				if (h==0 || h==n-1 || i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");		
				}
			
			System.out.print(" ");	
			System.out.print(" ");	
			
			// To print letter "A"
			
			for (int a=0; a<n; a++)
				{
				if (a==0 && i!=0 || i==0 && a!=0 && a!=(n-1) || a==n-1 && i!=0 || i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");		
				}
			
             System.out.print(" ");	
         	System.out.print(" ");	
			
			// To print letter "N"
			
			for (int o=0; o<n; o++)
				{
				if (o==0 || o==n-1 || o==i) 
					System.out.print("*");
				else
					System.out.print(" ");		
				}
			
			System.out.print(" ");	
			System.out.print(" ");	
			
			// To print letter "D"
			
			for (int d=0; d<n; d++)
				{
				if (d==0 || i==0 && d!= (n-1) || d==n-1&& i!=0 && i!= n-1 ||  i==(n-1) && d!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");		
				}
			
			System.out.print(" ");
			System.out.print(" ");	
			
			// To print letter "U"
			
			for (int u=0; u<n; u++)
			{
			if (u==0 && i!= n-1 || i==n-1 && u!=0 && u!=n-1 || u==n-1 && i!=n-1)
				System.out.print("*");
			else
				System.out.print(" ");		
			}
					
			System.out.println(" ");	
			
		}		     
		
	}

}
