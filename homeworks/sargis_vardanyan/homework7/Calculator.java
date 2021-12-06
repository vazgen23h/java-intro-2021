package homework7;

public class Calculator {

	public static void main(String[] args) {
		
		
		double[] array = new double[args.length - 1];
		
		for (int i = 1; i < args.length; i++) {
			array[i - 1] = Double.parseDouble(args[i]);	
		}
		
		for (int i = 1; i < args.length - 1; i++) {
			System.out.print(array[i - 1] + " " + args[0] + " ");	
		}
		System.out.println(array[array.length - 1] + " = " + calculator(args[0].charAt(0), array));
		
	}

	static double calculator(char operator, double ... var) {
		double result;
		
		switch(operator) {
			case '+':
				result = 0;
				for(double i: var) {
					result += i;
				}
				return result;
			case '-':
				result = 2 * var[0];
				for(double i: var) {
					result -= i;
				}
				return result;
			case '*':
				result = 1;
				for(double i: var) {
					result *= i;
				}
				return result;
			case '/':
				if(var[0] == 0) {
					System.out.println("Wrong parameter input: division by 0");
					return 0;
				} else {
					result = var[0] * var[0];
					for(double i: var) {
						result /= i;
					}
					return result;
				}
			default:
				System.out.println("Wrong operator input: ");
				return 0;		
		}
	
	}
	
}	
