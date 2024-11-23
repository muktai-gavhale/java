package demo.operators;



 class Student  {
	 public static void main(String args[]) {
			Student s1=new Student(1, "john","java");
			Student s2=new Student(2, "test","c++");
			s1.display();
			s2.display();
					
		}
	//public static void main(String args[]) {
		
	
		/*int x = 10;
		int y = 12;
		if(x+y < 10){
			System.out.println("x+y is less than 10");
		} else {
			System.out.println("x+y is greater than 10");
		}  
	}*/
	
	/*int id=100;
	String name="java";
	public static void main(String args[]) {
		Student s1=new Student();
		System.out.println(s1.id);
		System.out.print(s1.name);
		
	}*/
	
		int rollno;
		String name,course;
		Student(int rollno1,String name1,String course){
			this.rollno=rollno1;
			this.name=name1;
			this.course=course;
		}
			
			private void Student() {
			// TODO Auto-generated method stub
			
		}

			void display(){
				System.out.println(rollno+" "+name+" "+course);
				
			
		}
	 
	 
	 
	 
 }
			
		
	
 			
			
		
		
	


