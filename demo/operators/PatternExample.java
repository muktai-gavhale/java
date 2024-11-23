package demo.operators;

import java.util.Scanner;

public class PatternExample {
	public static void main(String args[]) {
		
		/*int i,j,rows=6;
		for( i=0;i<rows;i++) {
			
			for(j=rows-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				
			  System.out.print("*");
			}
		}
		System.out.println();
		*/
		
		/*int i,j,number,n=10;
		for(i=0;i<n;i++) {
			number=1;
			for(j=0;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
				
			
		}*/
		
		/*int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		rows=sc.nextInt();
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		
		
		int rows=4;
		for(int i=1;i<=rows;i++) {
			int num;
			if(i%2==0) {
				num=0;
				for(int j=1;j<=rows;j++) {
					System.out.print(num);
					num=(num==0)? 1:0;
					
				}
			}
			else {
				num=1;
				for(int j=1;j<=rows;j++) {
					System.out.print(num);
					num=(num==0)? 1:0;
				}
			}
			System.out.println();
			
		}
	}

}

