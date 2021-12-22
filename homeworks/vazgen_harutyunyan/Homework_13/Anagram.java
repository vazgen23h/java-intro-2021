public class Anagram {

	static int[] occ = new int[26];

    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";
        System.out.println(ifAnagram(a,b));
    }


    static boolean ifAnagram(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        boolean isAnagram=false;
        if(a.length() != b.length()) return false;

        for(int i = 0; i < arrayA.length; i++) {
            int ch = arrayA[i];
            if(ch >= 65 && ch <= 90) {
                arrayA[i] = ((char)(ch + 32));
            }
            ch = arrayB[i];
            if(ch >= 65 && ch <= 90) {
                arrayB[i] = ((char)(ch + 32));
            }
        }

        for(int i = 0; i < arrayA.length - 1; i++) {
            for(int j = 0; j < arrayA.length - i - 1; j++) {
                if(arrayA[j] > arrayA[j + 1]) {
                    char temp = arrayA[j];
                    arrayA[j] = arrayA[j + 1];
                    arrayA[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < arrayB.length - 1; i++) {
            for(int j = 0; j < arrayB.length - i - 1; j++) {
                if(arrayB[j] > arrayB[j + 1]) {
                    char temp = arrayB[j];
                    arrayB[j] = arrayB[j + 1];
                    arrayB[j + 1] = temp;
                }
            }
        }

       


        int count = 0;
        for(int i = 0; i < arrayA.length; i++) {
            if(arrayA[i] == arrayB[i]) {
                count++;
            }
        }
        if(count == arrayA.length) {
            return !isAnagram;
        } else {
            return isAnagram;
        }
    }
}