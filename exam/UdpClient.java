import java.io.*;
import java.net.*;
import java.util.*;

public class UdpClient
{
	public static void main(String args[])
	{
		try
		{
			byte[] buf=new byte[256];
			DatagramSocket socket=new DatagramSocket();
			InetAddress address=InetAddress.getByName("localhost");
			
			System.out.println("Enter a number:");
			Scanner obj=new Scanner(System.in);
			String num=obj.nextLine();
			buf=num.getBytes();
			DatagramPacket packet=new DatagramPacket(buf,buf.length,address,1234);
			socket.send(packet);
			packet=new DatagramPacket(buf,buf.length);
			socket.receive(packet);
			System.out.println(new String(packet.getData()));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}