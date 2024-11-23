package demo.operators;

import java.util.Scanner;

public class NestedIfExample4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		if(marks>= 60) {
			System.out.println("A grade");
			
		}else {
			System.out.println("B grade");
		}
			
	}

}
