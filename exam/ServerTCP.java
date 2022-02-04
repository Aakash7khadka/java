import java.net.*;
import java.io.*;
import java.util.*;

public class ServerTCP
{
	public static void main(String args[])
	{
		try{
			ServerSocket ss=new ServerSocket(1234);
		System.out.println("Waiting for client");
		Socket socket=ss.accept();
		System.out.println("Connection established");
		
		PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
		Scanner in_network=new Scanner(socket.getInputStream());
		
		Double radius=Double.parseDouble(in_network.nextLine());
		Double area=3.14*radius*radius;
		out.println(area);
		System.out.println("The area is:"+area+"and server is closed");
		out.close();
		in_network.close();
		ss.close();
		socket.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}