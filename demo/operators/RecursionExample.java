package demo.operators;

public class RecursionExample {
	static int count=0;
	static void p() {
	count++;
	if(count<=5) {
		System.out.println("welcome"+" "+count);
		p();
		}
	}

public static void main(String args[]) {
	p();
}
	//returns the factoiral number

	/*static int factorial(int n) {
		if (n==1)
			return 1;
		else
			return(n*factorial(n-1));
	}

public static void main(String args[]) {
	System.out.println("factorial of 5 is:"+factorial(5));
}*/
	
	//Fibbonaci Series

	/*static int n1=0,n2=1,n3=0;
	static void printFibo(int count) {
		if (count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibo(count-1);
			
		}
		
	}
public static void main(String args[]) {
	int count =15;
	System.out.print(n1+" "+n2);
	printFibo(count-2);
}*/
	
	/*public static  void p() {
	System.out.println("hello");
	p();
	}	
	public static void main(String args[]) {
		p();
	}*/
	
	
	
}
