package programs.AmolKoshtipdf;

import java.util.Scanner;

public class StringCompare {

	public static void main (String[] args)
	{
		String a,b;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Eneter the first string:");
		a=in.nextLine();
		System.out.println("Eneter the Second string:");
		b=in.nextLine();
		
		if (a.compareTo(b)>0)
			System.out.println("First string is greater than Second i.e:" + a);
		else if (a.compareTo(b)<0)
			System.out.println("Second string is greater than First i.e:" + b);
		else 
			System.out.println("Both the strings are equal");
		in.close();
		
	}
	
}
