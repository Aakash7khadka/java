import java.net.*;
import java.util.*;
import java.io.*;
public class Server1
{
	public static void main(String args[])
	{
		
		try{
		ServerSocket ss=new ServerSocket(1234);
		System.out.println("Server is waiting for client");
		Socket so=ss.accept();
		Scanner sc=new Scanner(so.getInputStream());
		PrintWriter out=new PrintWriter(so.getOutputStream(),true);
		
		out.println("Enter radius of circle to get area:");
		double radius=Double.parseDouble(sc.nextLine());
		double area=3.14*radius*radius;
		out.println("The area is:"+area);
		System.out.println("The response is sent");
		out.close();
		sc.close();
		so.close();
		ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}