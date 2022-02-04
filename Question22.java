import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Question22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try{
			
			File obj=new File("Question22.txt");
			if(obj.createNewFile())
			{
				System.out.println("New file created");
				
			}
			else
			{
				System.out.println("File Already exist");
			}
			
			FileWriter file=new FileWriter("Question22.txt");
			System.out.println("Enter name:");
			file.write("Name:"+sc.nextLine()+"\n");
			
			System.out.println("Enter Address:");
			file.write("Address:"+sc.nextLine()+"\n");
			
			System.out.println("Enter Age:");
			file.write("Age:"+sc.nextLine()+"\n");
			
			System.out.println("Enter Height:");
			file.write("Height:"+sc.nextLine()+"\n");
			System.out.println("Enter Weight:");
			file.write("Weight:"+sc.nextLine()+"\n");
			file.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}