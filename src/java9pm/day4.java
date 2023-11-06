package java9pm;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program 1 
		
		int a = 10 ;
		int b = 5 ;
		
		if(a > b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		
		// program 2 // Ternary operator
		
		String avail = a > b ? "a is greater":"b is greater";
		System.out.println(avail);
		
		
		// program 3
		
		int age = 17;
		String drive = age >= 18 ? "can drive":"cannot driver";
		System.out.println(drive);
		
		// program 4
		// Switch without break statement
		
//		String city = "inde";
//		switch(city) {
//			case "pune":
//				System.out.println("MH");
//			case "indore":
//				System.out.println("MP");
//			case "jaipur":
//				System.out.println("RJ");
//			default:
//				System.out.println("Incorrect city name");
//		}
		
		// program 5 
		// Switch  with break statement ; 
		
//		String city2 = "indore";
//		
//		switch(city2) {
//		case "nagpur":
//			System.out.println("MH");
//			break;
//		case "jaipur":
//			System.out.println("RJ");
//			break;
//		case "indore":
//			System.out.println("MP");
//			break;
//		default:
//			System.out.println("Incorrect city name");
//			
//		}
		
		// program 3 
		
		String city3 = "pune";
		
		switch(city3) {
		case "nagpur":
		case "pune":
			System.out.println("MH");
			break;
		case "indore":
		case "bhopal":
			System.out.println("MP");
			break;
		case "jaipur":
		case "udaipur":
			System.out.println("Rj");
			break;
		default:
			System.out.println("Incorrect city name");
			
		}
		
		
	

	}

}
