package demo.operators;

import java.lang.reflect.Array;

public class ReflectArraygetDoubleExample {
	public static void main(String args[]) {
		double[] arr= {1.2,5.7,7.5};
		for(int i=0;i<arr.length;i++);
		
		double vl=Array.getDouble(arr, 2);
		System.out.println(vl);
	}

}
