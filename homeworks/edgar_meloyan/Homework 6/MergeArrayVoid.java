public class MergeArrayVoid {

    static int[] newArr;
    
    public static void main(String[] args) {
        int[] arr1 = new int [10];
        int[] arr2 = new int [20];
        initArray(arr1);
        initArray(arr2);
        merge(arr1, arr2);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }


    public static void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }


    public static void merge(int[] leftArray, int[] rightArray) {
        newArr = new int [leftArray.length + rightArray.length];

        for (int i = 0; i < leftArray.length; i++) {
            newArr[i] = leftArray[i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            newArr[leftArray.length + j] = rightArray[j];
        }
    }
}