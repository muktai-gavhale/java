package demo.operators;

public class Students20 implements Cloneable {
	int rollno;
	String name;
	Students20(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
	}
	public Object clone()throws CloneNotSupportedException {
		return super.clone();
		
	}
	public static void main(String args[]) {
		try {
			Students20 s1=new Students20(100,"amit");
			Students20 s2=(Students20)s1.clone();
			
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
		}catch(CloneNotSupportedException c){}
			
		
	}
	

}
