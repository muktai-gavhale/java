package demo.operators;

public class TestGarbageC {
	public void finalize() {
		System.out.println("object garbage is collected");
	}
	public static void main(String args[]) {
		TestGarbageC s1=new TestGarbageC();
		TestGarbageC s2=new TestGarbageC();
		s1=null;
		s2=null;
		System.gc();
		
	}
	
}
