package programs.AmolKoshtipdf;

import java.util.Scanner;

public class Swap2nowithoutusing3rdvariable {

	public static void main(String[] args) {
		
		int x,y;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: x");
		x=in.nextInt();
		System.out.println("Enter Second number: y");
		y=in.nextInt();
		
		System.out.println("Before swaping values of x and y are:" + " " + x + " " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swaping values of x and y are:" + " " + x + " " + y);
		
		in.close();
	}

}
