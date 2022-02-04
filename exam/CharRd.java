import java.io.*;

public class CharRd
{
	public static void main(String args[])
	{
		try{
			FileReader in=new FileReader("input.txt");
			FileWriter out=new FileWriter("output.txt");
			char[] a=new char[20];
			in.read(a);
			for(char c:a)
				System.out.println(c);
			in.close();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}