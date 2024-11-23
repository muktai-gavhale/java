package demo.operators;

public class TestThrowAndThrows {
	static void method()throws ArithmeticException{
		System.out.println("inside the method");
		throw new ArithmeticException("throwing the Arithematic exception");
	}
	public static void main(String args[]) {
		try {
			method();
		}catch(ArithmeticException e) {
			System.out.println("caught in main method");
		}
		System.out.println("rest of the code");
	}


}


