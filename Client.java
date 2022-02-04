import java.net.*;
import java.io.*;

public class Client{
	private Socket socket=null;
	private DataInputStream input=null;
	private DataOutputStream out=null;
	private DataInputStream in=null;
	
	public Client(String address, int port){
		try{
			socket=new Socket(address,port);
			System.out.println("Connected");
			
			input=new DataInputStream(System.in);
			out=new DataOutputStream(socket.getOutputStream());
			in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		String line="";
		while(!line.equals("Stop")){
			try{
			line=input.readLine();
			out.writeUTF(line);
			line=in.readUTF();
			System.out.println(line);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		try{
			input.close();
			out.close();
			in.close();
			socket.close();
		}
		catch(Exception e){
			
		}
	}
	public static void main(String args[]){
		Client client=new Client("127.0.0.1",5000);
	}
}