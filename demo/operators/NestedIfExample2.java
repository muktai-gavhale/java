package demo.operators;

import java.util.Scanner;

public class NestedIfExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		System.out.println("enter the weight");
		int age=sc.nextInt();
		int weight = sc.nextInt();
		if (age>=18) {
			if(weight<=60) {
				System.out.println("you are eligible to donate blood");
			}else {
				System.out.println("you are not eligible to donate blood");
			} 
			
			
				
			
		}
	}
}

