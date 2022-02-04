import java.net.*;
import java.io.*;
import java.util.*;

public class Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket server =new ServerSocket(1234);
		System.out.println("Server waiting for client");
		Socket socket =server.accept();
		System.out.println("connection accepted");
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
		Scanner net_in=new Scanner(socket.getInputStream());
		Scanner in=new Scanner(System.in);
		String smsg,rmsg;
		
		do
		{
			rmsg=net_in.nextLine();
			System.out.println("Client:"+rmsg);
			System.out.println("Server:");
			smsg=in.nextLine();
			out.println(smsg);
		}
		while(rmsg!="stop");
		in.close();
		net_in.close();
		out.close();
		socket.close();
		server.close();
	}
}