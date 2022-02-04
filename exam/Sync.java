

class Common{
	synchronized void print10()
	{
		try{
			for(int i=1;i<11;i++)
			{
				Thread.sleep(5);
				System.out.println(i);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class ThreadImp extends Thread
{
	Common c;
	String name;
	ThreadImp(Common c,String name)
	{
		this.c=c;
		this.name=name;
	}
	public void run()
	{
		this.c.print10();
		System.out.println(this.name+" exiting");
	}
}
public class Sync
{
	public static void main(String args[])
	{
		Common c=new Common();
		ThreadImp t1=new ThreadImp(c,"First");
		ThreadImp t2=new ThreadImp(c,"Second");
		
		t1.start();
		t2.start();
	
	}
}