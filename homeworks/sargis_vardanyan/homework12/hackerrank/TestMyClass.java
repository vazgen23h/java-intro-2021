package hackerrank;



public class TestMyClass {
	
	public static void main(String[] args) {
		
		String time = "07:01:01PM";
		System.out.println(MyClass.timeConversion(time)); 
		
		String a = "Kamikadze";
		String b = "kamikadze";		
		System.out.println(MyClass.isAnagrams(a, b));  	
		
	}
	
}

class MyClass {

	public static boolean isAnagrams(String a, String b) {
		short[] arrayA = new short[256];
		short[] arrayB = new short[256];		
		
		if (a.length() != b.length()) return false;

        for (short i = 0; i < a.length(); i++) {
            if (65 <= a.charAt(i) && a.charAt(i) <= 90) {
                arrayA[a.charAt(i) + 32]++;
            } else {
            	arrayA[a.charAt(i)]++;                
            }
            if (65 <= b.charAt(i) && b.charAt(i) <= 90) {
                arrayB[b.charAt(i) + 32]++;
            } else {
            	arrayB[b.charAt(i)]++;                
            }
        }

        for (short i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i]) {
                return false;
            }
        }
        return true;
			
	}
	
	public static String timeConversion(String s) {
	
		String firstPart = s.substring(0, 2);
		String secondPart = s.substring(2, s.length() - 2);
		int first = Integer.parseInt(firstPart);
		String result = s.substring(0, s.length() - 2);
		
		if (s.charAt(s.length() - 2) == 'A') {
			if (first == 12) {
				result = "00" + secondPart; 
				return result;
			} 
		} else if (s.charAt(s.length() - 2) == 'P') {
			if (first < 12) {
				first += 12; 
				result = first + secondPart;
				return result;
			} 
		}
		return result;
	
	}
	
}
