package Polymorphism;

class Aeroplane
{
 public void fly()
 {
	 System.out.println("Aeroplane is flying");
 }
 
 public void carry()
 {
	 System.out.println("Aerplane carry passenger or goods");
 }
 
}

class Cargoplane extends Aeroplane
{
	 public void fly()
	 {
		 System.out.println("Cargoplane is flying");
	 }
	 
	 public void carry()
	 {
		 System.out.println("Cargoplane carry goods");
	 }
}

class Domesticplane extends Aeroplane
{
	 public void fly()
	 {
		 System.out.println("Domesticplane is flying");
	 }
	 
	 public void carry()
	 {
		 System.out.println("Domesticplane carry passengers");
	 }
}

class Result			
{
	public void polymethod (Aeroplane ref)                 // Polymorphism 
	{
	ref.fly();
	ref.carry();
	}
}


public class Class1 {

	public static void main(String[] args)
	{
	
		Domesticplane D= new Domesticplane();
		Cargoplane C= new Cargoplane();
		Result R=new Result();		
		R.polymethod(D);
		R.polymethod(C);
				
	}

}
