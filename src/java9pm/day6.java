package java9pm;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for with break

//		for(int i  = 1 ; i <= 5 ; i++) { // 2 // 3
//			if(i  == 3) {
//				break;
//			}
//			
//			System.out.println(i); // 1 // 2
//		}

		// for with break

//		for(int i = 1 ; i <= 3 ; i++) {// 2 // 3
//			 
//			System.out.println(i); // 1 // 2 // 3
//			
//			if(i == 3) {
//				break;
//			}
//			
//		}

		// intialization

//		while(condition) {
//			// statements
//			// increment
//		}

		// program 1

		int t1 = 1;
		while (t1 <= 3) {
			System.out.println(t1); // 1 // 2 // 3
			t1++; // 2 // 3 // 4
		}

		// program 2

		int t2 = 1;
		while (t2 <= 5) {
			System.out.println(t2);
			t2++;
		}

		// program 3
		// print hello 3 tyms

		int t3 = 1;
		while (t3 <= 3) {
			System.out.println("hello"); // hello // hello // hello
			t3++; // 2 // 3 // 4
		} 
		
		
		// program 4 5 to 1
		
		int t4 =5 ;
		while(t4 >= 1) {
			System.out.println(t4); // 5 // 4 // 3 // 2 // 1
			t4 --; // 4 // 3 // 2 // 1 // 0
		}
		
		// table of 2 
		
		int t5 = 1;
		while(t5 <= 10) {
			System.out.println(t5 * 2); // 2 // 4 // 6 ----- 20
			t5 ++; // 2 // 3 ------- 11
		}
		
		int t6 = 2 ;
		while(t6 <= 20) {
			System.out.println(t6); // 2,,4,6,8,10,12,14,16,18,20
			t6 = t6 + 2; // 22
			
		}
		
		
		// table of 5 in reverse 
		
		int t7 = 50 ;
		while(t7 >= 5) {
			System.out.println(t7);
			t7 = t7-5;
		}
		
		
		
		
		
		
		
		
		
		

	}

}
