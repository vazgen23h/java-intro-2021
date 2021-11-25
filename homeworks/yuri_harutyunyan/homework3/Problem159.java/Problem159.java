import java.util.Scanner;
public class Problem159{
	public static void main(String args[]){
		int sum=1;
		for(int i=100;i>=100&&i<=999;i++){
			if(i%3==1&&i%4==2){
				sum=sum*i;

			}
		}
			System.out.println(sum);
}

}