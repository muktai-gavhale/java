package demo.operators;

public class Operators {
	public static void main(String args[]) {
	int x = 10;
	int y = 10;
	int z = 15;
	x+= 5;
	z-= 5;
	y*= 2;
	int min = (x<z)?x:z;
	System.out.println(x++);
	System.out.println(++x);
	System.out.println(x--);
	System.out.println(--x);
	System.out.println(x++ + ++x);
	System.out.println(y++ + y++);
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
	System.out.println(10<<2);
	System.out.println(10<<3);
	System.out.println(10>>2);
	System.out.println(10>>3);
	System.out.println(10>>>3);
	System.out.println(x<y&& x<z);
	System.out.println(x<y& x<z);
	System.out.println(x);
	System.out.println(min);
	System.out.println(y);
	}
	
	
		
		
	

}

	


