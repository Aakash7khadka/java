import java.net.*;
import java.io.*;

public class Server
{
    private Socket socket=null;
    private ServerSocket server=null;
    private DataInputStream in =null;
    private DataOutputStream out=null;

    public Server(int port)
    {
        try{
        server= new ServerSocket(port);
        System.out.println("Server Started and waiting for a client ...");
        socket=server.accept();
        System.out.println("Client accepted");
        in= new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        out=new DataOutputStream(socket.getOutputStream());
        String line="";

        while(!line.equals("Stop")){
            try{
                line=in.readUTF();
                double r=Double.parseDouble(line);
                double ar= 3.14*r*r;
                System.out.println(ar);
                String area="Area"+ar;
                out.writeUTF(area);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            System.out.println("Closing connection");
            socket.close();
            in.close();
            out.close();

        }
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
        public static void main(String args[]){
            Server server=new Server(5000);
    }
}