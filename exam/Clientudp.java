import java.net.*;
import java.io.*;
import java.util.*;

public class Clientudp
{
	public static void main(String args[]) throws Exception
	{
		byte[] buf=new byte[256];
		DatagramSocket socket =new DatagramSocket();
		InetAddress address=InetAddress.getByName("localhost");
		DatagramPacket packet=new DatagramPacket(buf,buf.length,address,1234);
		socket.send(packet);
		
		
		//
		packet=new DatagramPacket(buf,buf.length);
		socket.receive(packet);
		 String data=new String(packet.getData());
		System.out.println("Data from server: "+data);
		socket.close();
	}
}