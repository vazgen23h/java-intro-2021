public class Problem159 {
    public static void main(String[] args) {
        long product = 1L; //
        int firstNumber = 100;
        int arrayLength = 900;
        int[] array = new int[arrayLength];
        for(int i = 0; i < 900; i++) {
            array[i] = firstNumber;
            firstNumber++;
        }

        for(int i = 0; i < 900; i++) {
            if(array[i] % 3 == 1 || array[i]%4==2 ) {
                product = product * array[i];
            }  
        }
        System.out.println(product);
        //Product out of range Long variable type
    }
    
}
