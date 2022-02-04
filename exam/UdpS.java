import java.io.*;
import java.net.*;

public class UdpS
{
	public static void main(String args[])
	{
		try{
			byte[] buf=new byte[256];
			DatagramSocket socket=new DatagramSocket(1234);
			DatagramPacket packet=new DatagramPacket(buf,buf.length);
			socket.receive(packet);
			InetAddress address=packet.getAddress();
			int port=packet.getPort();
			String msg="Kudos from server";
			buf=msg.getBytes();
			packet=new DatagramPacket(buf,buf.length,address,port);
			socket.send(packet);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}