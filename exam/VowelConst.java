import java.util.*;
import java.io.*;

public class VowelConst
{
	public static void main(String args[])
	{
		try{
			FileWriter vo_in=new FileWriter(new File("vowel.txt"));
			FileWriter co_in=new FileWriter(new File("conso.txt"));
			
			System.out.println("enter a string:");
			Scanner sc=new Scanner(System.in);
			String text=sc.nextLine();
			text=text.toLowerCase();
			for(int i=0;i<text.length();i++)
			{
				char ch=text.charAt(i);
				System.out.println(ch);
				if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vo_in.write(ch);
				}
				else
				{
					co_in.write(ch);
				}
			}
			vo_in.close();
			co_in.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}