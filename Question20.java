
class Thread1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			System.out.println("Thread 1:"+i);
		}
	}
}
class Thread2 extends Thread{
	
	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			System.out.println("Thread 2:"+i);
		}
	}
}
public class Question20 
{
	public static void  main(String args[])
	{
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		thread1.start();
		thread2.start();
	}
	
	
}