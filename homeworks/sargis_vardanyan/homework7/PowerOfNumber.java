package homework7;


public class PowerOfNumber {

	public static void main(String[] args) {
	
		System.out.println(args[0] + " power of " + args[1] + ": " +
		 power(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	
	}
	
	static int power(int x, int n) {
		int pow = 1;
		
		if (n > 0) {
			pow = x * power(x, n -1);
			return pow;
		} else if(n == 0) {
			return pow;
		}
		
		return pow;
	}

}


















