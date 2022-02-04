import java.io.*;

class Person implements Serializable
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
	
	public void displayName()
	{
		System.out.println(this.name);
	}
}

public class ObjectIO
{
	public static void main(String args[])
	{
		Person p1=new Person("Ram");
		
		try{
			FileOutputStream out=new FileOutputStream("output.txt");
		ObjectOutputStream oo=new ObjectOutputStream(out);
		oo.writeObject(p1);
		
		FileInputStream in=new FileInputStream("output.txt");
		ObjectInputStream oi=new ObjectInputStream(in);
		
		Person p2=(Person) oi.readObject();
		p2.displayName();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}