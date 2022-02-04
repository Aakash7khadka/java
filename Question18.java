import java.util.*;
public class Question18
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen=obj.nextLine();
		int count=0;
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("The number of words:"+(count+1));
	}
}