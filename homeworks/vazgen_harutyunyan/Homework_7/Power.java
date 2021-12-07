public class Power{
	public static void main(String[] args){
 System.out.println(power(2,3));
	}
	
	static int power(int number, int power){
		int p=1;
		while(power>0){
			p=p*number;
			power--;
		}
		return p;
	}
}
