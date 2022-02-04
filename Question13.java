 interface Info
{
	public void displayInfo();
}

public class Question13 implements Info
{
	public void displayInfo()
	{
		System.out.println("This is implemented using inheritance");
	}
	public static void main(String args[])
	{
		Question13 qq=new Question13();
		qq.displayInfo();
	}
}