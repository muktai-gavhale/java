package demo.operators;

public class Wrapper {
	//Primitive into object
	public static void main(String args[]) {
		/*int a=20;//convert int to Integer
		Integer i=Integer.valueOf(a);
		Integer j=a;
		System.out.println(a+" "+i+" "+j);*/
		
		
		//Object into primitive
		/*Integer a=new Integer(3);   //convert Integer to int
		int i=a.intValue();
		int j=a;
		System.out.println(a+" "+i+" "+j);*/
		
		
		//All primitive into its corresponding
		byte b=10;
		int i=30;
		char c='a';
		boolean b2=true;
		short s=20;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		
		
		Byte byteobj=b;
		Integer intobj=i;
		Character charobj=c;
		Boolean boolobj=b2;
		Short shortobj=s;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		
		//printing the object 
		
		System.out.println("------printing the object values-----");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Boolean object:"+boolobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		
		
		//unboxing:converting object to primitive 
		
		byte bytevalue=byteobj;
		int intvalue=intobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		short shortvalue=shortobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		
		//printing primitive
		System.out.println("-------printing the primitive values------");
		System.out.println("byte value:"+bytevalue);
		System.out.println("int value:"+intvalue);
		System.out.println("char value:"+charvalue);
		System.out.println("boolean value:"+boolvalue);
		System.out.println("short value:"+shortvalue);
		System.out.println("long value:"+longvalue);
		System.out.println("float value:"+floatvalue);
		System.out.println("double value:"+doublevalue);
	}

}


		
		
	


