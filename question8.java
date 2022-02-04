import java.util.*;
public class question8{
	public static void main(String args[]){
		System.out.println("Enter 10 numbers:");
		int n=10;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		try
		{
			for(int i =0;i<10;i++)
			{
			a[i]=sc.nextInt();
			
			}
			for(int i=0;i<n-1;i++)
			{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
			}
		
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++)
		{
			
			System.out.println(a[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}