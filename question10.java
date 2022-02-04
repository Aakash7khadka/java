 class Car
{
	int price;
	 Car(int price){
		this.price=price;
		System.out.println("Price is:"+this.price);
	}
}
 class Toyota extends Car
{
	String model;
	 Toyota(String model,int price)
	{
		super(price);
		this.model=model;
		
		System.out.println("Model is:"+this.model);
	}
}

public class question10
{
	public static void main(String args[])
	{
		Toyota toyo=new Toyota("Prado",30000000);
	}
}