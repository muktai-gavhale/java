package demo.operators;

public class StringMethod4 {
	public static void main(String args[]) {
		/*
		 * String s1="welcome to javatpoint"; System.out.println(s1.startsWith("w"));
		 * if(s1.startsWith("w")) { System.out.println("y"); }else {
		 * System.out.println("o"); }
		 */
		
		String s1 = "Welcome to  javatpoint";
		StringBuilder sb = new StringBuilder(s1);  
		String reverseString = sb.reverse().toString();
		System.out.println(reverseString);
		
        					
	}
	

}
