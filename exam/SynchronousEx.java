import java.util.*;

 class Common 
{
	synchronized void print10(String name)
	{
		System.out.println(name);
		for(int i=1;i<10;i++)
		{
			try{
				Thread.sleep(5);
				System.out.println(i);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

 class Threads extends Thread
{
	String name;
	Common c;
	Threads(String name,Common c)
	{
		this.name=name;
		this.c=c;
	}
	public void run()
	{
		c.print10(name);
	}
}

public class SynchronousEx
{
	public static void main(String args[])
	{
		Common c=new Common();
		Threads t1=new Threads("first",c);
		Threads t2=new Threads("second",c);
		t1.start();
		t2.start();
		
	}
}