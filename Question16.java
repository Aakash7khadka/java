import java.util.*;
class CustomException extends Exception
{
	CustomException(String msg)
	{
		super(msg);
	}
}

public class Question16
{
	public static void main(String args[])
	{
		try{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number between 2-10:");
		int num=obj.nextInt();
		if(num >10 || num<2)
		{
			throw new CustomException("Number must be between 2-10 only");
		}
		System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}