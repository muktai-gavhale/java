package demo.operators;

import java.io.IOException;

class Parent{
	void msg()throws Exception   {
		System.out.println("parent method");
	}
}

public class TestExceptionChild extends Parent {
	void msg()throws Exception{
		System.out.println("child method");
	}
	public static void main(String args[]) throws IOException   {
		Parent p=new TestExceptionChild();
		try {
			p.msg();
		}catch(Exception e) {}
	}

}
