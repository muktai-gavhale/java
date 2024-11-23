package demo.operators;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TryCatchExample {
	public static void main(String args[]) {
		/*try {
			int data=50/0;
		}
		catch (Exception e) {
			System.out.println("Arithmetic Exception");
		}*/
		
		/*int i=50;
		int j=0;
		int data;
		try {
			data= i/j;
		}
		catch(Exception e) {
			System.out.println(i/(j+2));
		}*/
		
		/*try {
			int data=50/0;
		}
		catch (Exception e) {
			int data1=50/0;
		}
		
		System.out.println("rest of the code");*/
		
		/*try {
			int arr[]= {1,3,5,7};
			System.out.println(arr[10]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			
		}
		System.out.println("rest of the code");*/
		
		PrintWriter pw;
		try {
			pw=new PrintWriter("jtp.txt");
			pw.print("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
		
	}

}
