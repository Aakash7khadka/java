import java.io.*;
import java.net.*;
public class OpenConnectionEX
{
	public static void main(String[] args) 
	{
		try{
			URL url=new URL("https://www.onlinekhabar.com/news");
		URLConnection con=url.openConnection();
		InputStream stream=con.getInputStream();
		int i;
		while((i=stream.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}