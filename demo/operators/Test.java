package demo.operators;

public final  class Test {
	public static void main(String args[]) {
		Test t=new Test("ABC123");
		String s1=t.getpancardNumber();
		System.out.println("Pancard Number is:" +s1);
		
	}
	String pancardNumber = "ABC123"; 
	public  Test(String pancardNumber) {
		this.pancardNumber=pancardNumber;
	}
	public String getpancardNumber() {
		return pancardNumber;
	}
	

}
class immutableDemo{
	
}
