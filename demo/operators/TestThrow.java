package demo.operators;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow {
	/*public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person are not eligible to voting");
		}
		else {
			System.out.println("Person are eligible to voting");
		}
		
	}
	public static void main(String args[]) {
		validate(15);
		System.out.println("rest of the code");
	}*/
	
	/*public static void method()throws FileNotFoundException{
		FileReader file=new FileReader("created the new file");
		
		BufferedReader fileInput=new BufferedReader(file);
		
		throw new FileNotFoundException();
	}
	public static void main(String args[]) {
		try {
			method();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}*/
	
	public static void checkNum(int num) {
		if (num<1){
			throw new ArithmeticException("\n number is negative cannot calculate the square");
			
		}
		else {
			System.out.println("square of"+num+"is"+num*num);
		}
			
			
	}
	public static void main(String args[]) {
		TestThrow obj=new TestThrow();
		obj.checkNum(4);
		System.out.println("rest of the code");
	}

}
