import java.util.*;
import java.io.*;
import java.net.*;
public class Client1
{
	public static void main(String args[])
	{
		try
		{
			Socket so=new Socket("127.0.0.1",1234);
			Scanner sc=new Scanner(so.getInputStream());
			PrintWriter out=new PrintWriter(so.getOutputStream(),true);
			System.out.println(sc.nextLine());
			Scanner inp=new Scanner(System.in);
			String radius=inp.nextLine();
			out.println(radius);
			System.out.println(sc.nextLine());
	
			
			out.close();
			sc.close();
			so.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}