package demo.operators;

import java.util.Scanner;

public class CompilerCommandExample {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder();
		Integer i=new Integer(5);
		Scanner sc=new Scanner(System.in);
		Exception e=new Exception();
		System.out.println(sb.getClass());
		System.out.println(i.getClass());
		System.out.println(e.getClass());
		System.out.println(sc.getClass());
		
		Object o=Compiler.command("java compiler command example");
		System.out.println("value return by methods is:"+o);
	}

}
