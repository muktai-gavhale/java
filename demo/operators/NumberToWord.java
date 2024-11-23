package demo.operators;

import java.util.Scanner;

public class NumberToWord {
	/*private static final String[] twodigits= {"","ten","twenty","thirty","forty","fifty"};
	private static final String[] onedigits= {"","one","two","three","four","five"};
	
	private NumberToWord(){}
	
	private static String convertUptoThousand(int number) {
		String soFar;
		if(number %  100 < 20) {
			soFar=onedigits[number%100];
			number=number/100;
		}
		else {
			soFar=onedigits[number%10];
			number=number/10;
			soFar=twodigits[number%10]+soFar;
			number=number/10;
		}
		if(number==0)
			return soFar;
		    return onedigits[number]+"Hundred"+ soFar;
	}
	public static String convertNumberToWord(long number) {
		if(number==0) {
			return"zero";
		}
		String num=Long.toString(number);
		String pattern="000000000000";
		DecimalFormat decimalFormat=new DecimalFormat(pattern);
		num=decimalFormat.format(number);
		
		int billions=Integer.parseInt(num.substring(0,3));
		int millions=Integer.parseInt(num.substring(3,6));
		int HundredThousan=Integer.parseInt(num.substring(6,9));
		int Thousand=Integer.parseInt(num.substring(9,12));
		
		String tradBillions;
		
		switch(billions) {
		case 0:
			tradBillions=" ";
			break;
		case 1:
			tradBillions=convertUptoThousand(billions)+"Billions";
		    break;
		    default:
		   tradBillions=convertUptoThousand(billions)+"Billions";
		}
		String result=tradBillions;
		String tradMillions;
		
		switch(millions) {
		case 0:
			tradMillions=" ";
			break;
		case 1:
			tradMillions=convertUptoThousand(millions)+"Million";
			break;
			default:
				tradMillions=convertUptoThousand(millions)+"Million";
		}
		 result=result+tradMillions;
		 String tradHundredThousands;
		 
		 switch(hundredThousands) {
		 case 0:
			 tradHundredThousands=" ";
			 break;
		 case 1:
			 tradHundredThousands="one Thousand";
			 break;
			 default:
				 tradHundredThousands=convertUptoThousand(hundredThousands)+"Thousand";
			 
		 }
		 result=result+tradHundredThousand;
		 String tradThousand;
		 tradThousand=convertUptoThousand(Thousand);
		 result=result+tradThousand;
		 
		 return result.replaceAll("^\\s+"","").replaceAll("\\b\\s{2,}\\b","");
		}
	public static void main(String args[]) {
		System.out.println(convertNumberToWord(2));
		System.out.println(convertNumberToWord(20));
		System.out.println(convertNumberToWord(21));
		System.out.println(convertNumberToWord(19));
		System.out.println(convertNumberToWord(12));
		System.out.println(convertNumberToWord(5));
		System.out.println(convertNumberToWord(18));
		System.out.println(convertNumberToWord(1000));
		System.out.println(convertNumberToWord(12765));
		System.out.println(convertNumberToWord(2007));

		


		
	}*/
	
	/*static void NumberToWord(char num[]) {
		int len=num.length;
		
		if(len==0) {
			System.out.println("the string is empty");
			return;
		}
		if(len>4) {
			System.out.println("\n the given number has more than 4 digits");
			return;
		}
		String[] onedigits=new String[]{"one","two","three","four","five"};
		String[] twodigits=new String[] {"","ten","eleven","twelve","thirteen","fourteen","fifteen"};
		String[] multipleoftens=new String[] {"","","twenty","thirty","fourty","fifty"};
		String[] poweroftens=new String[] {"Hundred","Thousand"};
		
		System.out.print(String.valueOf(num)+":");
		
		if(len==1) {
			System.out.println(onedigits[num[0]-'0']);
			return;
		}
		int x=0;
		while(x < num.length) {
			if(len>=3) {
				if(num[x]-'0'!=0) {
					System.out.print(onedigits[num[x]-'0']+"");
					System.out.print(poweroftens[len-3]+"");
				}
				--len;
			}
			else {
				if(num[x]-'0'==1) {
					int sum=num[x]-'0'+ num[x+1]-'0';
					System.out.println(twodigits[sum]);
					return;
				}else if(num[x]-'0'==2 && num[x+1]-'0'==0) {
					System.out.println("Twenty");
					return;
					}
				else
				 {
					int i=(num[x]-'0');
					if(i>0) 
						System.out.print(multipleoftens[i]+"");
					else
							System.out.print("");
						++x;
					if(num[x]-'0'!=0)
						System.out.println(onedigits[num[x]-'0']);
						
				}
			}
			++x;
		}
					}
	public static void main(String args[]) {
		NumberToWord("312".toCharArray());
		NumberToWord("442".toCharArray());
		NumberToWord("564".toCharArray());
		NumberToWord("111".toCharArray());
		NumberToWord("764".toCharArray());
		NumberToWord("207".toCharArray());
		NumberToWord("2109".toCharArray());
		NumberToWord("1205".toCharArray());
		NumberToWord("546".toCharArray());
		
		NumberToWord("".toCharArray());

	}*/
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		if(number<1||number>10){
			System.out.println("Invalid number");
		}else {
			String SD[]= {"","one","two","three","four","five","six","seven","eight","nine","ten"};
			System.out.println(SD[number]);
		}
	}

}
