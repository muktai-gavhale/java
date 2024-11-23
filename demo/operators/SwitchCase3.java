package demo.operators;

import java.util.Scanner;

public class SwitchCase3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		switch(number) {
		case 1:System.out.println("2");
		break;
		case 2:System.out.println("4");
		break;
		case 3:System.out.println("6");
		break;
		case 4:System.out.println("8");
		break;
		case 5:System.out.println("10");
		break;
		case 6:System.out.println("12");
		break;
		default:System.out.println("Invalid number");
		
		}
	}

}
