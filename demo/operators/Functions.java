package demo.operators;

import java.util.Scanner;

public class Functions {
	/*public static void printMyName(String name) {
		System.out.println(name);
		return ;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		printMyName(name);
		
	}*/
	
	
	/*public static int CalculateProducts(int a, int b) {
		 return a*b;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("products of two number is:"+ CalculateProducts(a,b));
	}*/
	
	
	public static int CalculateSum(int a,int b) {
		int sum=a+b;
		return sum;
	} 
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum=CalculateSum(a,b);
		
		System.out.println("sum of the two number is:"+sum);
		
	}

}
