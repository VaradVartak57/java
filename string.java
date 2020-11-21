import java.util.*;

class string{
	
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter string s: ");
        String s = inp.nextLine();
        System.out.println(s.length());
        System.out.println("replace: " + s.replace('h','l'));
        System.out.println(s.replace("hello","hi"));
		System.out.print("Enter string s1: ");
		String s1 = inp.nextLine();
		System.out.println(s.equals(s1));
		
		System.out.print("Enter string s2: ");
		String s2=inp.nextLine();
		System.out.print("Enter string s3: ");
		String s3=inp.nextLine();
		System.out.print("Concated String: ");
		System.out.println(s2.concat(s3));
		
		System.out.print("Lowercased string: ");
		System.out.println(s2.toLowerCase());
		
		System.out.print("Uppercased string: ");
		System.out.println(s3.toUpperCase());
		
		System.out.print("Enter string s4: ");
		String s4=inp.nextLine();
		System.out.println("Is the string Empty?");
        System.out.println(s4.isEmpty());

		}
	}