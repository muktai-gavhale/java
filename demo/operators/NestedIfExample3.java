package demo.operators;

import java.util.Scanner;

public class NestedIfExample3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		if (number>= 0) {
			if(number<= 10) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		} 
			
		}
	}

}
