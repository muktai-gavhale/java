package demo.operators;

//call by value example

 public class Operation {
	 int data=50;
	 void change(int data) {
		 data=data+100;
	 }
 public static void main(String args[]) {
	Operation op=new Operation();
	System.out.println("before change"+" "+op.data);
	op.change(500);
	System.out.println("after change"+" "+op.data);
 }
 }
	 
  /*int data=100;
  void change(Operation op) {
	  op.data=op.data+200;
  }
  public static void main(String args[]) {
	  Operation op=new Operation();
	  System.out.println("before change"+" "+op.data);
	  op.change(op);
	  System.out.println("after change"+" "+op.data);
  }*/
	 
	

  
