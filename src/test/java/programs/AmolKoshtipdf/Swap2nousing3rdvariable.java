package programs.AmolKoshtipdf;

import java.util.Scanner;

public class Swap2nousing3rdvariable {

	public static void main(String[] args) {
		
		int x,y,temp;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: x");
		System.out.println("Enter Second number: y");
		x=in.nextInt();
		y=in.nextInt();
		
		System.out.println("Before swaping values of x and y are:" + " " + x + " " + y);
		
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("After swaping values of x and y are:" + " " + x + " " + y);
		
		in.close();
	}

}
