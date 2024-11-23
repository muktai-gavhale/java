package demo.operators;

public class StringMethod12 {
	public static void main(String args[]) {
		
	
		/*String s1="java string split methods";
		String[] words=s1.split("\\s");
		for (String w:words) {
			System.out.println(w);
		}*/
		
		
		String s1 = "welcome";
		String s2 = s1.intern();
		String s3 = new String("welcome");
		System.out.println(s1==s2);
		System.out.println(s3==s1);
		
	}

}
