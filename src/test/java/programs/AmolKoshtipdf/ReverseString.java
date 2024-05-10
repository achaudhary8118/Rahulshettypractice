package programs.AmolKoshtipdf;

import java.util.Scanner;

public class ReverseString {
	
	public static void main (String args [])  {
		
		String Original,Reverse = ""; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string which you want to reverse");
		Original = in.nextLine();
		
		for (int i=Original.length()-1;i>=0;i--) {
			Reverse=Reverse + Original.charAt(i);
		}
		
		System.out.println("Reverse String is :" + Reverse);
		
		in.close();
		
		StringBuffer a = new StringBuffer("Java programming is fun");
		 System.out.println(a.reverse());
		 
		 if (Original.equals(Reverse))
			 System.out.println("Entered string is a palindrome.");
			 else
			 System.out.println("Entered string is not a palindrome.");
	}

}
