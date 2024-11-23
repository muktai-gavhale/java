package demo.operators;

//To print the fibonacci series

import java.util.Scanner;
public class Task2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the series");
		int num = sc.nextInt();
		int n = 100,Firstnum = 0 , secondnum = 1;
		int nextnum;
		
			for(int i = 1; i <= n; i++) {
			
			nextnum = Firstnum + secondnum;
			System.out.println( Firstnum + " ");
			Firstnum = secondnum;
			secondnum = nextnum;
		}
		
		
	}

}
