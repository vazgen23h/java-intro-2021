// Task162
// Find the largest four-digit number that multiplied by 14 becomes the square of a natural number.
public class Problem162 {
    public static void main(String[] args) {
        int firstNumber = 1000;
        int firstArrayLength = 9000;
        int max = 0;
        int[] firstArray = new int[firstArrayLength];
        int[] secondArray = new int[9000];
        for(int i = 0; i < firstArrayLength; i++) {
            firstArray[i] = firstNumber * 14;
            firstNumber++;
        }
        for(int i = 0; i < firstArrayLength; i++) {
            for(int j = 2; j <= firstArray[i] / 2; j++) {
                if(j * j == firstArray[i]) {
                    secondArray[i] = firstArray[i];
                }
            }
        }
        for(int i = 0; i < secondArray.length; i++) {
            if (max < secondArray[i]) {
                max = secondArray[i];
            }
        }
        System.out.println(max / 14);

    }
}