import java.net.*;
import java.io.*;

public class UdpC
{
	public static void main(String args[])
	{
		try{
			byte[] buf=new byte[256];
		DatagramSocket socket=new DatagramSocket();
		InetAddress address=InetAddress.getByName("localhost");
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