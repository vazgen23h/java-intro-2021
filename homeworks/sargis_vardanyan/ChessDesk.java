package sargis_vardanyan;

/*
  Print chess desk, using arrays and loops.
*/
public class ChessDesk{
	
public static void main(String[] args) {
      
      char [][] a = new char [10][];
      a[0] = new char[]{' ',  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',  ' '};

      for (int i = 1; i < a.length - 1; i++) {
         a[i] = new char[a.length];
         a[i][0] = (char)(a.length - 1 - i + '0');
         for (int j = 1; j < a.length - 1; j++) {
            a[i][j] = (i + j) % 2 == 0 ? ' ' : '*';
         }
         a[i][9] = (char)(a.length - 1 - i + '0');
      }


      a[9] = new char[]{' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', ' '};

      for (int i = 0; i < a.length; i++) {
         for(int j = 0; j < a[i].length; j++){
            System.out.print(a[i][j] + "  ");
         }
         System.out.println();
      }
      

  }
}
