package demo.operators;

// Example of runtime polymorphism

 public class Bike {
	void run() {System.out.println("running");}
	public static void main(String args[]) {
		Bike b=new splender();
		b.run();
	}

}
class splender extends Bike{
	void run() {System.out.println("running safely with 50km");}
	}
	
/*class shape{
	void draw() {System.out.println("drawing");}
	public static void main(String args[]) {
		shape s;
		s=new Rectangle();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Triangle();
		s.draw();
	}
}
class Rectangle extends shape{
	void draw() {System.out.println("drawing rectangle");}
}
class Circle extends shape{
	void draw() {System.out.println("drawing Circle");}
}
class Triangle extends shape{
	void draw() {System.out.println("drawing triangle");}
}*/
	
