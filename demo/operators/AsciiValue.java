package demo.operators;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String args[]) {
		
		/*int ch1='a';
		int ch2='b';
		
		
		System.out.println("the ASCII value of a is= "+ ch1 );
		System.out.println("the ASCII value of b is= "+ ch2 );
		*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the characters");
		char chr= sc.next().charAt(0);
		int asciivalue=chr;
		System.out.println("ASCII value of"+ chr+"is:" + asciivalue);
		*/
		
		for(int i=65;i<=90;i++) {
			System.out.println("the ASCII value of "+(char)i+ " is "+ " = "+ i);
		}
			
	
	}

}
