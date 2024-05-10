package programs.AmolKoshtipdf;

import java.util.Scanner;

public class add2numbersinJava {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: x");
		x=in.nextInt();
		System.out.println("Enter Second number: y");
		y=in.nextInt();
		
		z=x+y;
		System.out.println("Addition of x and y are:" + " " +z);
		
		in.close();
	}

}
