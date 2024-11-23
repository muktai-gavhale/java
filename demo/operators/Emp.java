package demo.operators;

public class Emp {
	int id;
	String name;
	String address;
	
	
	public  Emp(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name+" "+address);
		//System.out.println(address);
	}
public static void main(String args[]) {
	Emp e=new Emp(101,"varun","pune");
	Emp e1=new Emp(102,"Arun","mumbai");
	Emp e2=new Emp(103,"megha","nashik");
	
	e.display();
	e1.display();
	e2.display();
	
}
	

}
