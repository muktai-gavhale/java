package demo.operators;

public class JavaBooleanExample {
	public static void main(String args[]) {
		Boolean b1=true;
		System.out.println("Boolean value is = "+b1);
		System.out.println("Hash code for boolean value = "+b1.hashCode());
		
		String str=b1.toString();
		System.out.println("String value = "+str);
		System.out.println("Hash code for String value = "+str.hashCode());
		
		Boolean b2=Boolean.valueOf(b1);
		System.out.println("value of method will return = "+b2);
		boolean val1=true;
		for(int i=0;i<10;i++){
			if(i==5) {
				System.setProperty("val1", "true");
				break;
			}
		}
		Boolean b3=Boolean.getBoolean("val1");
		System.out.println("value of val is = "+b3);
	}

}
