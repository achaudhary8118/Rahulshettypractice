package programs.AmolKoshtipdf;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0,c,reverse=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for reverse order");
		c=in.nextInt();
		n=in.nextInt();
		while(c>=0)
		{	System.out.println(c);
		c--;		
	}
		while( n != 0 )
		 {
		 reverse = reverse * 10;
		 reverse = reverse + n%10;
		 n = n/10;
		 }
		 System.out.println("Reverse of entered number is "+reverse);
		in.close();
		
		
}
}
