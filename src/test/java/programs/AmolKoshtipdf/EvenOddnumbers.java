package programs.AmolKoshtipdf;

import java.util.Scanner;

public class EvenOddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number which you want to check Even or odd:");
		a=in.nextInt();
		if (a%2==0)
		System.out.println("Given number is Even number:" + a);
		else 
		System.out.println("Given number is odd number:" + a);
		in.close();
	}

}
