package demo.operators;

public class FinalizeExample {
	public static void main(String args[]) {
		FinalizeExample obj=new FinalizeExample();
		System.out.println("Hashcode is:"+obj.hashCode());
		obj=null;
		System.gc();
		System.out.println("end of the garbage collection");
	}
	protected void finalize() {
		System.out.println("called the finalize method");
		
		
	}

}
