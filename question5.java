import java.util.Scanner;
public class question5{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your marks:");
		int n=sc.nextInt();
		if(n<=100 &&n>=80){
			System.out.println("Excellent");
		}
		else if(n<80 && n>=60){
			System.out.println("Good");
		}
		else if(n<60 && n>=40){
			System.out.println("Average");
		}
		else if(n<40 && n>=0){
			System.out.println("More effort needed");
		}
		else{
		
			System.out.println("Please input value between 0-100");
		
		}
		
	}
}