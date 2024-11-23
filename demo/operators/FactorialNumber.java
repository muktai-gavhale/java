package demo.operators;

import java.util.Scanner;
public class FactorialNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int n,fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
			
		}
		System.out.println("factorial"+" "+ fact);
	}
	

}
