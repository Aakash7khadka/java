import java.util.*;
public class Question19
{
	public static void  main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=obj.nextLine();
		System.out.println("The reversed array is:");
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i));
		}
		
	}
}