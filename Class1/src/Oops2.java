class Dog
{
	private int Cost;
	private String Name;
	
	public Dog()
	{
		System.out.println("No parameters constructor");
	}
	
	public Dog(int Cost, String Name)
	 {
		System.out.println("Parameters constructor");
		 this.Cost=Cost;
		 this.Name=Name;
	 }	 
		 public int getCost() {
				return Cost;
			}

			public String getName() {
				return Name;
			}
		 	 	
}

public class Oops2 
{

	public static void main(String[] args) 
	{
		
		Dog d1=new Dog();
		Dog d2=new Dog(10,"Sheru");	
		
		System.out.println(d2.getCost());
		System.out.println(d2.getName());
	}

}
