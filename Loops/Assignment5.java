package Loops;
import java.util.Arrays;
public class Assignment5 {

	public static void main(String[] args) {
		String a="Roshini";
		String b="RaviTeja";
		//String Length
		System.out.println("First string length: "+a.length());
		System.out.println("Second string length: "+b.length());
		
		// char 4 of each string
		System.out.println("First string length: "+a.charAt(4));
		System.out.println("Second string length: "+b.charAt(4));
		
		//two strings are equal or not
		 System.out.println(a.equals(b));
	
		//Display the strings in Ascending order
		 char string1[] = a.toCharArray();
	      Arrays.sort(string1);
	      System.out.println(new String(string1));
	      String c=b.toLowerCase();
	      char string2[] =c.toCharArray();
	      Arrays.sort(string2);
	      System.out.println(new String(string2));
}
}
