package pack;

public class Mammal implements Animal
{
	public void eat(String food)
		{
			System.out.println("Eats:"+food);
		}
		public void noOfLegs(int legs)
		{
			System.out.println("Have"+" "+legs+" legs");
		}
	public static void main(String args[])
	{
		Mammal obj=new Mammal();
		obj.eat("Grass");
		obj.noOfLegs(4);
	}
}