package demo.operators;

import java.io.IOException;

public class TestExceptionPropagation {
	void m() throws IOException {
		
		/*int data=50/0;
	}
	void n() {
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
		TestExceptionPropagation obj=new TestExceptionPropagation();
		obj.p();
		System.out.println("normal flow");*/
		
		throw new java.io.IOException("device error");
	}
	void n() throws IOException {
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
		TestExceptionPropagation obj=new TestExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}

}
