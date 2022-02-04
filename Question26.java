import java.util.*;

public class Question26
{
	public static void main(String args[])
	{
		ArrayList<String> strList=new ArrayList<String>();
		strList.add("Nepal");
		strList.add("India");
		strList.add("China");
		
		Iterator<String> iter=strList.iterator();
		
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}