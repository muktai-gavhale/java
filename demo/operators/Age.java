package demo.operators;
import java.util.Scanner;
public class Age {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("you are eligible to donate blood");
		}else  {
			System.out.println("you are not eligible to donate blood ");
		}
			
		
	}

}
