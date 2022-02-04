public class question9
{
	public static int add_num(int a,int b,int c)
	{
		return a+b+c;
	}
	public static int add_num(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		System.out.println("Sum: "+add_num(1,2));
		System.out.println("Sum: "+add_num(3,4,5));
	}
}