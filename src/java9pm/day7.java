package java9pm;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// intialization

		// while(condition){
		// 		statements
				// increment / decrement
		
		// }
		
		// program 1
		int t2 = 1;
		while(t2 <= 5){
			if(t2 == 3) {
				break;
			}
			System.out.println(t2); // 1 // 2
			t2 ++; // 2 // 3
		}
		
		
		// program 2
		
		int t3 = 5 ;
		
		while(t3 >= 1) {
			System.out.println(t3); // 5 // 4 // 3
			if(t3 == 3) {
				break;
			}
			t3 --;  // 3
		}
		
		// program 3
		
		int t4 = 5 ; 
		
		while(t4 <= 10) {
			if(t4 == 7) {
				break;
			}
			System.out.println(t4); // 5 // 6
			t4 ++; // 6 // 7
			
		}
		
		// program 4
		int t5 = 1;
		while(t5 <= 5) {
			
			if(t5 == 3) {
				
				t5++ ; // 4
				continue;
			}
			
			System.out.println(t5);// 1 // 2 // 4 // 5

			t5++;  // 2 // 3 // 5 // 6
			  
		}
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
				
		
		
		
		
		
		
		

	}

}
