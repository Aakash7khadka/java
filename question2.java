import java.util.Scanner;
public class question2{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=sc.nextInt();
		System.out.println("Sum:"+(num1+num2));
		System.out.println("Diff:"+(num1-num2));
		System.out.println("Product:"+(num1*num2));
		System.out.println("Div:"+(num1/num2));
	}
}