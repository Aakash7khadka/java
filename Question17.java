import java.util.*;
public class Question17
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String names[]=new String[5];
		System.out.println("Enter 5 names:");
		for(int i=0;i<5;i++)
		{
			names[i]=obj.nextLine();
		}
		
		for(int i=0;i<4;i++)
		{
			int min=i;
			for(int j=i+1;j<5;j++)
			{
				if(names[j].compareTo(names[min])<0)
				{
					min=j;
				}
			}
			String temp=names[i];
			names[i]=names[min];
			names[min]=temp;
		}
		System.out.println("The sorted names are:");
		for(int i=0;i<5;i++)
		{
			System.out.println(names[i]);
		}
	}
}