public class Problem429 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int number = 1;
        int quantity = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matrix[i][j] = number;
                number++;
            }
        }
        for(int i = 0; i < 4; i++) {
            for(int j = i; j < 4 ; j++) {
                if(matrix[i][j] % 5 == 2) {
                    quantity++;
                }
            }
        }
        for(int i = 0; i < 4; i++) {
            for(int j = i; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Quantity = " + quantity);
    }
}