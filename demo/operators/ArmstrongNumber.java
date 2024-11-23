package demo.operators;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
	public static void main(String args) {
		int number;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				number=sc.nextInt();
	}
	
		static boolean isArmstrong(int n) {
			int digits = 0,sum = 0,temp;
			temp = n;
			while(temp>0) {
				temp=temp/10;
				digits++;
			}
			System.out.println("number of digits"+ digits);
			temp=n;
			while(temp>0) {
				int lastDigits=temp % 10;
				sum =(int)(sum + Math.pow( lastDigits, digits));
				temp=temp/10;
				
			}
			if (sum==n)
				return (true);
			else return (false);
		}
		public static void main(String args[]) {
			int num = 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			num=sc.nextInt();
			if(isArmstrong(num)) {
				System.out.println("Armstrong");
			}else {
				System.out.println("Not Armstrong");
			}
				
		} 
	}

