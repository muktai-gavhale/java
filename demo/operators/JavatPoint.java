package demo.operators;

//Creating the custom wrapper class

public class JavatPoint {
	private int i;
	JavatPoint(){};
	JavatPoint(int i){
		this.i=i;
	} 
	public int getValue() {
		return i;
	}
	public void setValue() {
		this.i=i;
	}
	public String toString() {
		return Integer.toString(i);
		
	}
	
	//Testing the custom wrapper class
	
public static class TestJavatpoint{
	public static void main(String args[]) {
		JavatPoint j=new JavatPoint(10);
		System.out.println(j);
		
	}
			
}	

}
