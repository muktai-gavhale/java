package demo.operators;

//to print the even number from the fibonacci series

import java.util.Scanner;
public class task3 {
	public static void main(String args[]) {
		int firstnumber = 0;
		int secondnumber = 2;
		System.out.println("enter the element in the fibonacci series ");
		Scanner sc = new Scanner(System.in);
		int elementcount = sc.nextInt();
		System.out.println(firstnumber + " ");
		System.out.println(secondnumber + " ");
		for (int i = 2 ; i < elementcount ; i++) {
			int nextnumber = firstnumber + secondnumber;
			System.out.println( nextnumber + " ");
			firstnumber = secondnumber;
			secondnumber = nextnumber;
		}
	
			
		
		
		
	}

}
