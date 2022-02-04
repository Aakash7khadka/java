import java.net.*;
import java.io.*;
import java.util.*;

public class Client
{
	public static void main(String args[]) throws Exception
	{
		
		Socket socket =new Socket("localhost",1234);
		System.out.println("connection accepted");
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
		Scanner net_in=new Scanner(socket.getInputStream());
		Scanner in=new Scanner(System.in);
		String smsg,rmsg;
		
		do
		{
			System.out.println("Client:");
			smsg=in.nextLine();
			out.println(smsg);
			rmsg=net_in.nextLine();
			System.out.println("Server:"+rmsg);
		}
		while(rmsg!="stop");
		in.close();
		net_in.close();
		out.close();
		socket.close();
	
	}
}