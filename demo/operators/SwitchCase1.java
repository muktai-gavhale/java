package demo.operators;

import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc. nextInt();
		switch(age) {
		case 10:System.out.println("10");
		break;
		case 20:System.out.println("20");
		break;
		case 30:System.out.println("30");
		break;
		default:System.out.println("Invalid age");
		
		}
	}

}
