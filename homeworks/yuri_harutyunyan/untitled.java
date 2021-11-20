import java.util.Scanner;
public class untitled{
	public static void main(String args[]){
	 int a;

	 Scanner scanner=new Scanner(System.in);
	  a=scanner.nextInt();
	  int b=a%12;
	  
	 if(b==0||b==1||b==2){
	 	System.out.println("It is winter");
	 }
	  else if (b==3||b==4||b==5){
	 	System.out.println("It is Spring");
	 }
	 else	 if (b==6||b==7||b==8){
	 	System.out.println("It is Summer");
	 }

	 	 else{
	 	System.out.println("It is Autumn");
	 }

	}
	 


		
	

	}

