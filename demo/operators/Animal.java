package demo.operators;

//single inheritance and multilevel and hierarchical

 /*public class Animal {
	void eat() {System.out.println("eating");}
	public static void main(String args[]) {
		BabyDog d=new BabyDog();
		d.eat();
		d.bark();
		d.weep();
		
	}

	
	}
	class Dog extends Animal{
		void bark() {System.out.println("barking");}
			
	}
	class BabyDog extends Dog{
		void weep() {System.out.println("weeping");}
	}*/
public class Animal{
	void eat() {System.out.println("eating");}
	public static void main(String args[]) {
		Animal a;
		a=new Cat();
		a.eat();
		a=new Dog();
		a.eat();
		a=new Lion();
		a.eat();
		
	}
}
class Cat extends Animal{
	void eat() {System.out.println("eating rat");}
}
class Dog extends Animal{
	void eat() {System.out.println("eating bread");}
}
class Lion extends Animal{
	void eat() {System.out.println("eating meat");}
}





