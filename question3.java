import java.util.Scanner;
public class question3{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}