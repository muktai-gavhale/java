package demo.operators;

public class StringMethod13 {
	public static void main(String args[]) {
		/* String name="java";
		* String s1 = String.format("name is %s", name);
		* String s2 = String.format("name is %s", "Rina Patil");
		* String s3 = String.format("value is %f", 21.54);
		* String s4 = String.format("value is %32.12f", 32.8765);
		*  String s5 = String.format("value is %d", 2002);
		* String s6 = String.format("value is %c", 'j');
		
		 * System.out.println(s1);
		 *  System.out.println(s2);
		 * System.out.println(s3);
		 *  System.out.println(s4);
		 * System.out.println(s5);
		  System.out.println(s6);
		*/
		
		/*String s1 = "ABCDEFGHIJKLMN";
		byte[] barr = s1.getBytes();
		for(int i = 0; i<barr.length;i++) {
			System.out.println(barr[i]);
			
		}*/
		
		String joinString1 = String.join("-", "Welcome","to","javatpoint");
		System.out.println(joinString1);
		}

}
