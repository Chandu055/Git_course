
public class Slantlines {
	public static void main(String[] args) {
	
	int n= 9;

    for (int i=0; i<n; i++){
        for (int j=0; j<2*n; j++)
        {
            if  ((i+2*j==n-1)  || (2*j-i==(n-1))  || (i==(n-1)/2  && (j>= (n-1-i)/2) && (1.3*j<= (n-1+i))))
            	
            	// (i==(n-1)/2 && (j>= (n-1-i)/2) && (j<= (n-1+i)/2)))
            {
                System.out.print("*");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    
}

}

