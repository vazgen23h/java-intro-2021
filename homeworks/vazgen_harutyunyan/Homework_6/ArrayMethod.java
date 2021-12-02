public class ArrayMethod {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[10];
        init(array1);
        init(array2);
        int[] array3 = new int[array1.length + array2.length];
        merge(array1, array2, array3);
        for(int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
    public static void init(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
    public static void merge(int[] array1, int[] array2, int[] array3) {
        int index = 0;
        for(int i = 0; i < (array1.length + array2.length); i++) {
            if(i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[index];
                index++;
            }
        }
    }
}