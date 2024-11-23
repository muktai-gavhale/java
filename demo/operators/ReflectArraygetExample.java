package demo.operators;

import java.lang.reflect.Array;

public class ReflectArraygetExample {
	public static void main(String args[]) {
		String[] sarr=(String[])Array.newInstance(String.class, 4);
		
		Array.set(sarr, 0, "java");
		Array.set(sarr, 1, ".net");
		Array.set(sarr, 2, "python");
		Array.set(sarr, 3, "css");
		
		
		for(int i=0;i<sarr.length;i++) {
			System.out.println("sarr["+i+"]="+Array.get(sarr,i));
		}
		
	}

}
