import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
public class Question23
{
	public static void main(String args[])
	{
		try
		{
			File obj=new File("Question23.txt");
			if(obj.createNewFile())
			{
				System.out.println("New file created");
				
			}
			else
			{
				System.out.println("File Already exist");
			}
			FileWriter writer=new FileWriter("Question23.txt");
			File fileObj= new File("Question22.txt");
			Scanner sc=new Scanner(fileObj);
			while(sc.hasNextLine())
			{
				writer.write(sc.nextLine()+"\n");
			}
			sc.close();
			writer.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}