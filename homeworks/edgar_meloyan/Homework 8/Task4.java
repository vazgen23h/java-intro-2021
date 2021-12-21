
public class Task4 {
	public static void main(String[] args) {
		String str1 = "Hello world";
		String str2 = "This world is mad";
		String keyWord = "Hello";

		boolean test1 = str1.startsWith(keyWord); 
		boolean test2 = str2.startsWith(keyWord);

		System.out.println(str1 + " starts with " + keyWord + "? - " + test1);
		System.out.println(str2 + " starts with " + keyWord + "? - " + test2);
	}
}