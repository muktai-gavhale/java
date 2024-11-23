package demo.operators;

public class BreakExample {
	public static void main(String args[]) {
		/*for(int i = 1; i<= 10;i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}*/
		
		
		/*for(int j = 1;j < 5;j++) {
			if(j == 4) {
				break;
			}
			System.out.println(j);
		}*/
		
		
		/*for(int k = 2;k<= 8;k++) {
			if(k == 7) {
				break;
				
			}
			System.out.println(k);
		}*/
		
		
		int i = 1;
		while(i <= 10) {
			if (i == 5) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
