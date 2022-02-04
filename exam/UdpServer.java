import java.io.*;
import java.net.*;
import java.util.*;

public class UdpServer
{
	public static void main(String args[])
	{
		try
		{
			byte[] buf=new byte[256];
			DatagramSocket socket=new DatagramSocket(1234);
			DatagramPacket packet=new DatagramPacket(buf,buf.length);
			socket.receive(packet);
			String num=new String(packet.getData());
			InetAddress address=packet.getAddress();
			int port=packet.getPort();
			int number=Integer.parseInt(num);
			int facto=1;
			for(int i=1;i<=number;i++)
			{
				facto*=i;
			}
			
			String factorial=facto+"";
			buf=factorial.getBytes();
			packet =new DatagramPacket(buf,buf.length,address,port);
			socket.send(packet);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}