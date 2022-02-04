import java.net.*;
import java.io.*;
import java.util.*;

public class Serverudp
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket socket=new DatagramSocket(1234);
		byte[] buf=new byte[256];
		DatagramPacket packet =new DatagramPacket(buf,buf.length);
		socket.receive(packet);
		InetAddress address=packet.getAddress();
		int port=packet.getPort();
		String msg="Hello man you streaming the nepal show";
		buf=msg.getBytes();
		packet=new DatagramPacket(buf,buf.length,address,port);
		socket.send(packet);
		socket.close();
	}
}