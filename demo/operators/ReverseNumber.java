package demo.operators;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
		int number=21091996 , reverse=0;
		
		/*while(number!=0) {
			int remainder=number% 10;
			reverse=reverse*10 + remainder;
			number=number/10; {
				System.out.println("the reverse number given is:"+ reverse);				
			}
			
		}*/
		
		for(;number!=0;number=number/10) {
 
			int remainder=number%10;
			reverse=reverse*10 + remainder;
		}
		System.out.println("the reverse of the given number is:"+ reverse);
		
		
		/*if(number<10) {
			System.out.println(number);
			return;
		}
		else
		 {
			System.out.print(number % 10);
			ReverseNumber(number/10);
		}
			
		
	}
	public static void main(String args[]) {
		System.out.println("enter the number you want to reverse:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("the reverse of the given number is:");
		*/
		
		
	}

}
