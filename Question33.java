import java.util.*;
public class Question33{
	
	public static int isbalanced(int a[])
	{
		
		
		for(int i =0;i<a.length;i++)
		{
			if((i%2==0 && a[i]%2==1)||(i%2==1 && a[i]%2==0))
			{
				return 0;
			}
			
		}
		return 1;
		
	}
	public static void main(String args[])
	{
		int a[]={0,1,2,3,4,5,6};
		int val=isbalanced(a);
		System.out.println(val);
	}
}