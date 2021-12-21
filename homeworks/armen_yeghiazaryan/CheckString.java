public class CheckString {

        public static void main(String[] args)
        {
            String string1 = "Armen";
            String string2 = "Armenia";

            System.out.println("String 1: " + string1);
            System.out.println("String 2: " + string2);

            int result = string1.compareToIgnoreCase(string2);

            if (result < 0)
            {
                System.out.println(string1  + " smaller than " + string2);
            }
            else if (result == 0)
            {
                System.out.println( string1  + " equal than " + string2);
            } else {
                System.out.println(string1  +"Greater than " + string2);
            }
        }
}
