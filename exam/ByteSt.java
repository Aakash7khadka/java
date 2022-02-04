import java.io.*;

public class ByteSt
{
	public static void main(String args[])
	{
		try{
			FileInputStream in=new FileInputStream("input.txt");
			FileOutputStream out=new FileOutputStream("output.txt");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
			in.close();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}