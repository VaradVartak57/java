import java.util.*;
public class string1 {
    public static void main (String args[])
    {
        Scanner inp = new Scanner(System.in);
		System.out.print("Enter string name: ");
        String name = inp.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("last char: " + name.charAt(17));
        System.out.println("Substring: " + name.substring(5,10 ));
    }
}
