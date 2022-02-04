import java.io.*;
import java.util.*;
import java.net.*;

public class ClientTCP
{
	public static void main(String args[])
	{
		try
		{
			Socket socket=new Socket("localhost",1234);
			
			PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
			Scanner in_network=new Scanner(socket.getInputStream());
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter radius:");
			String radius=in.nextLine();
			out.println(radius);
			
			String area=in_network.nextLine();
			System.out.println("The area is:"+area);
			
			socket.close();
			in.close();
			in_network.close();
			out.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}