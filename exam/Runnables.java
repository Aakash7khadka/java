import java.util.*;
 class Threads implements Runnable
{
	String name;
	Threads(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println(name+i);
		}
	}
}

public class Runnables 
{
	public static void main(String args[])
	{
		Threads tt=new Threads("one");
		Thread t1=new Thread(tt);
		
		Threads ttt=new Threads("two");
		Thread t2=new Thread(ttt);
		
		
		t1.start();
		t2.start();
	}
}