package week1.day2;

public class Calculator {
	
	//int[] test = {1,2,3};
	

	// Create a class called Calculator with below methods

	// 1.- add() with 2 int arguments and return the sum
	// 2- sub() with 2 double arguments and return the subraction result
	// 3- mul() with 2 double arguments and return the result

	// 4- divide() with 2 int arguments and return the result
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	private int sub(int num1, int num2) {

		return num1 - num2;
	}

	private int mul(int num1, int num2) {

		return num1 * num2;
	}

	private int div(int num1, int num2) {

		return num1 / num2;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(20, 20));
		System.out.println(calc.sub(400, 250));
		System.out.println(calc.mul(2, 12));
		System.out.println(calc.div(120, 11));
		//System.out.println(calc.test[2]);
	}

}
