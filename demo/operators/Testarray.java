package demo.operators;

// Array Example

 class Testarray {
	 public static void  main(String args[]) {
		 
		
		 
		 
				 
		/* int a[]=new int [10];
		 
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;
		 a[5]=60;
		 a[6]=70;
		 a[7]=80;
		 a[8]=90;
		 a[9]=100;

		 
		 for(int i=0;i<a.length;i++) 
			 System.out.println(i);
		 
			*/ 

		/* int a[]= {10,20,33,21,3,4,8};
		 
		 for(int i=0;i<a.length;i++)
			 System.out.println(a[i]);



	 }*/
	 
	/* static void min(int arr[]) {
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++)
			 if(min>arr[i])
				 min=arr[i];
		 System.out.println(min);
	 }
	public static void main(String args[]) {
		 int a[]= {21,2,6,7,3,1};
		 min(a);
		 
	 }*/
	 
	 
	/* public static void main(String args[]) {
		 int arr[][]= {{1,2,3},{4,5,6},{7,8,8}};
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 System.out.print(arr[i][j]+" ");		 }
			 System.out.println();

			 
		 }*/
		 
		/* int arr[][]=new int[3][];
		  arr[0]=new int[2];
		  arr[1]=new int[3];
		  arr[2]=new int[4];
		  
		  int count=0;
		  
		  for(int i=0;i<arr.length;i++) 
			  for(int j=0;j<arr[i].length;j++) 
				  arr[i][j]=count++;
				  
				  for(int i=0;i<arr.length;i++) {
					  for(int j=0;j<arr[i].length;j++) {
						  System.out.print(arr[i][j]+" ");
					  }
					  System.out.println();
				  }*/
			  
		  
			/*int arr[]= {4,4,5};
			Class c=arr.getClass();
			String name=c.getName();
			
			System.out.println(name);
			
			*/
		 
		/* char[] copyForm= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		 
		 char[]copyTo=new char[7];
		 
		 System.arraycopy(copyForm, 2, copyTo, 0, 7);
		 
		System.out.println(String.valueOf(copyTo));
		*/
		 
		 
		/* int a[][]= {{1,3,4},{3,4,5}};
		 int b[][]= {{1,3,4},{3,4,5}};
		 
		 int c[][]=new int[2][3];
		 
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<3;j++) {
				 c[i][j]=a[i][j]+b[i][j];
				 
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }*/
		 
		 //addition of two matrices
		 
		/* int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		 int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		 
		 int c[][]=new int[3][3];
		 
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 c[i][j]=0;
				 for(int k=0;k<3;k++) {
					 
					 c[i][j]+=a[i][k]*b[k][j];
				 }
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }*/
		 
		 //cloning the array
		 
		 int arr[]= {33,3,4,5};
		 System.out.println ("printing the original array");
		 for(int i:arr);
		 System.out.println(arr);
		 
		 System.out.println("printing the clone array");
		  int carr[]=arr.clone();
				for(int i:carr);
				 System.out.println(arr);
				 
				 System.out.println("both are equal");
				 System.out.println(arr==carr);
				 
		 }
}
