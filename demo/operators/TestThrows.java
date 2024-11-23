package demo.operators;

import java.io.IOException;

	

public class TestThrows {
	public static int dividenum(int m,int n)throws ArithmeticException{
		int div= m/n;
		return div;
	}
	public static void main(String args[]) {
		TestThrows obj=new TestThrows();
		try {
			System.out.println(obj.dividenum(45, 0));
			}catch(ArithmeticException e) {
				System.out.println("\n number cannot by divide 0");	
				}
		System.out.println("rest of the code");
	}
}
	/*void m()throws IOException {
		throw new IOException("device error");
			
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("exception handled");
		}
	}
	public static void main(String args[]) {
		TestThrows obj=new TestThrows();
		obj.p();
		System.out.println("normal  flow");
	}*/
	
	
		
	


