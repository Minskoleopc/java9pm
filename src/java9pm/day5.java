package java9pm;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// loops 
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		// for loop and while loop
		
//		
//		for(initialization ; conditionCheck ; increment/decrement) {
//				// statements
//		}
		
		for(int i = 1 ; i <= 3 ; i++) { 
			
			System.out.println(i); 
			
		}
		
		// program 2
		
		for(int i = 1 ; i <= 5 ; i++ ) { // 2 // 3 // 4 // 5 // 6
			System.out.println(i); // 1 //2 //3 // 4  // 5	
		}
		// program 3  print "hello"  3 times 
		
		for(int i = 1 ; i <= 3 ; i++ ) { // 2 // 3 // 4
			System.out.println("hello");
		}
		
		// program 5  print 5 to 1
		
		for(int i = 5 ; i >= 1 ; i--) { //4 // 3 // 2 //1  // 0
			System.out.println(i); // 5, 4 , 3 ,2 ,1
		}
		// 5 >= 1 ===> true
		// 4 >= 1 ===> true
		// 3 >= 1 ===> true
		// 2 >= 1 ===> true
		// 1 >= 1 ===> true 
		
		// program 6 table of 2 
		
		for(int i = 2 ; i <= 20 ; i = i + 2) { // 4 // 6 // //8---// 22
				System.out.println(i); // 2 // 4 // 6 ----- 20 
		}
		
		
		


	}

}
