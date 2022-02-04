import java.io.*;
import java.net.*;
import java.util.*;
public class TcpS
{
	public static void main(String args[])
	{
		try{
			ServerSocket ss=new ServerSocket(1234);
			Socket socket=ss.accept();
			
			Scanner in_net=new Scanner(socket.getInputStream());
			PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
			
			String input=in_net.nextLine();
			Double radius=Double.parseDouble(input);
			Double area=3.14*radius*radius;
			out.println("Area:"+area);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}