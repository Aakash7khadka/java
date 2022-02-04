class Info
{
	public void display_info()
	{
		System.out.println("This information is never changed");
	}
}

public class question11 extends Info
{
	public void  display_info()
	{
		System.out.println("Information is changed");
	}
	
	public static void main(String args[])
	{
		Info in =new Info();
		in.display_info();
		
		Info inn =new question11();
		inn.display_info();
		question11 qq=new question11();
		qq.display_info();
	}
}