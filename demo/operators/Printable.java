package demo.operators;

 interface Printable {
	void print();
	/*public static void main(String args[]) {
		A7 obj=new A7();
		obj.print();
		obj.show();
	
	}

}
 interface Showable{
	 void show();
 }
 class A7 implements Printable,Showable{
	public void print(){
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}*/
	
	interface Showable extends Printable{
		void show();
	}
class TestInterface4 implements Showable{
	public void show() {
		System.out.println("Hello");
	}
	public void print() {
		System.out.println("Welcome");
	}
	
}
public static void main(String args[]) {
	TestInterface4 obj=new TestInterface4();
	obj.print();
	obj.show();
			
}
	
}
