package demo.operators;

import java.util.Scanner;

public class Method {
	public static void main(String args[]) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		 
		if(num % 2 == 0)
			System.out.println(num + "is even");
			else
				System.out.println(num + "is odd");
				*/
		int a = 20;
		int b = 40;
		int c = add (a,b);
		System.out.println("the sum of a and b is = "+ c);
	}
	public static int add(int n1,int n2) {
		int s;
		s=n1+n2;
		return s;
		
		
		
		//System.out.print("the minimum number is:"+Math.min(9,6));
		
		
	}
}
