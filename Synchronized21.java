class Disp{
	public synchronized void display()
	{
		for(int i=1;i<10;i++)
		{
			try{  
      Thread.sleep(100);  
     }catch(Exception e){System.out.println(e);}    
			System.out.println(i);
		}
	}
}

class Thread1 extends Thread{
	Disp obj;
	Thread1(Disp obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		
		this.obj.display();
	}
}
class Thread2 extends Thread{
	Disp obj;
	Thread2(Disp obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		
		this.obj.display();
	}
}

public class Synchronized21{
public static void main(String args[])
	{
		Disp obj=new Disp();
		Thread1 thread1=new Thread1(obj);
		Thread2 thread2=new Thread2(obj);
		thread1.start();
		thread2.start();
	}
}