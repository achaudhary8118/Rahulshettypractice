package programs.AmolKoshtipdf;

import java.util.Scanner;

public class Scannergetinputfromuser {

	public static void main(String[] args) {
		String a;
		int b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		a= in.nextLine();
		System.out.println("You enter string: "+a);
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter new Integer");
		b=in1.nextInt();
		System.out.println("You have enter Interger " +b);
		in.close();
		in1.close();
	}

}
