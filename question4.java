import java.util.Scanner;
public class question4{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				count=count+1;
				
			}
		}
		if(count==0){
			System.out.println("Prime");
			
		}
		else{
			System.out.println("Not Prime");
		}
	}
}