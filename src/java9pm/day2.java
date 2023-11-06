package java9pm;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		System.out.println(a);
		a = 20;
		System.out.println(a);

		boolean canDrive = true;
		System.out.println(canDrive);

		char letter = 'A';
		System.out.println(letter);

		float b = 20.5f;
		System.out.println(b);

		// type??

		// Introvert Extrovert

		// calm loud
		// less outing more outing
		// less social more social

		// Human ---- type
		// Property --> weight , color , height, age , name
		// Method --> walk() , talk()

		// Vehicle
		// Property ---> color , modelNo , type , regNo
		// Method ---> start() , stop()

		// Bank acc -
		// Property --- accNo , accName , bal , branchName
		// Method - deposit() , withdrawl()

		// operator

		// Arithmetic operator

		// Addition --- +
		// Subtraction ---- -
		// Multiplication --- *
		// Division ---- /
		// Modulus ----- %

		int a1 = 10;
		int a2 = 5;

		System.out.println(a1 + a2);
		System.out.println(a1 - a2);
		System.out.println(a1 * a2);
		System.out.println(a1 / a2);
		System.out.println(a1 % a2);
		System.out.println(23 % 5); // 3

		// comparison operators
		// < , > , <= , >= , != , ==
		// entity < entity =====> boolean ===> True or False

		System.out.println(23 > 2); // True
		System.out.println(23 < 2); // False
		System.out.println(23 >= 22); // True
		System.out.println(23 <= 22); // False
		System.out.println(23 <= 23); // True
		System.out.println(23 >= 23); // True
		System.out.println(23 != 23); // False
		System.out.println(23 == 23); // True

		// Logical operator
		// And -- &&

		// true && true --------> true
		// false && true --------> false
		// true && false --------> false
		// false && false --------> false
				

		// Or -- ||

		// true || true --------> true
		// false || true --------> true
		// true || false --------> true
		// false || false --------> false

		
		System.out.println(7 == 7 || 8 == 8);
		System.out.println(7 != 7 || 8 == 8);
		System.out.println(7 == 7 || 8 != 8);
		System.out.println(7 != 7 || 8 != 8);
		
		
		
		
		// Not --- !
		// ! false  --- true 
		// ! true   --- false
		
		System.out.println(!(8 == 8));
		System.out.println(!(8 == 7));

	}

}
