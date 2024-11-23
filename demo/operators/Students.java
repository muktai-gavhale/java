package demo.operators;


// Default constructor,Overload constructor and Parameterized constructor

 class Students {
	 int id;
	 String name;
	 int age;
	 int weight;
	 Students(int i,String n,int a){
		 id=i;
		 name=n;
		 age=a;
	 }
	 Students(int i,String n,int a,int b){
		 id=i;
		 name=n;
		 age=a;
		 weight=b;
		 
	 }
	 void display() {System.out.println(id+" "+name+" "+age+" "+weight);}
	 
	public static void main(String args[]) {
		 Students s1=new Students(100,"Ram",20,40);
		 Students s2=new Students(101,"Rina",25,45);
		 Students s3=new Students(102,"Shyam",20,46);
	     Students s4=new Students(103,"Mina",30,50);
		 Students s5=new Students(104,"Megha",24,40);
		 Students s6=new Students(105,"Sarita",21,40);
		 
		 s1.display();
		 s2.display();
		 s3.display();
		 s4.display();
		 s5.display();
		 s6.display();
	 }
	 
	/* int id;
	 String name;
	 int age;
	 Students(int i,String n){
		 id=i;
		 name=n;

	 }
	 Students(int i,String n,int a){
		 id=i;
		 name=n;
		 age=a;
		 
	 }
	void display() {System.out.println(id+" "+name+" "+age);}
	 public static void main(String args[]) {
		 Students s1=new Students(10,"Ram",25);
		 Students s2=new Students(13,"Rina");
		 
		 
		 s1.display();
		 s2.display();

	 }*/
	 
	 //Copy constructors
	 /*int id;
	 String name;
	 Students(int i,String n){
		 id=i;
		 name=n;
	 }
	 Students(Students s){
		 id=s.id;
		 name=s.name;
	 }
	 void display() {System.out.println(id+" "+name);}
	 
	 public static void main(String args[]) {
		 Students s1=new Students(7,"karan");
		 Students s2=new Students(s1);
		 
		 s1.display();
		 s2.display();
		 */
	 
  }	 		
	 		

