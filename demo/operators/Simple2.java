package demo.operators;

import java.util.StringTokenizer;
import java.util.*;

public class Simple2 {
	public static void main(String args[]) {
	
	StringTokenizer st=new StringTokenizer("my,name,is,java");
	
	
	//while(st.hasMoreTokens()) {
	//	System.out.println(st.nextToken());
	//}
	
	System.out.println("next token is:"+st.nextToken(","));

}
}
