package demo.operators;

public class StringComparision {
	public static void main(String args[]) {
		//String s1="john";
		//String s2="Strak";
		//String s3=s1.concat(s2);		//String s4="saurav";
		//String s5="john";
		
		//System.out.println(s1.compareTo(s5));
		//System.out.println(s2.equals(s3));
		//System.out.println(s1.equalsIgnoreCase(s2));
		//System.out.println(s3);
		
		StringBuilder s1=new StringBuilder("hello");
		StringBuilder s2=new StringBuilder("world");
		StringBuilder s3=s1.append(s2);
		System.out.println(s3.toString());
		
	}

}
