package demo.operators;

public interface Drawable {
	 void draw();
	 public static void main(String args[]) {
			Drawable d=new Square();
			d.draw();
			
			
		}
	 
		
}	
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
class Arc implements Drawable{
	public void draw() {
		System.out.println("drawing arc"); 
	}
}
class Square implements Drawable{
	public void draw() {
		System.out.println("drawing square");
	}
}
/*class TestInterface1{
	public static void main(String args[]) {
		Drawable d=new Rectangle();
		d.draw();
		
	}
}*/

