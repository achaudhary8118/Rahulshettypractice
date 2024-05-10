package programs.AmolKoshtipdf;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {

	int a,b;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the tempreture which want to convert into Celsius");
	
	a = in.nextInt();
	
	b= (a -32)*5/9;
	
	System.out.println("Tempreture in celsius:" + b);
	
	in.close();
	
}
}
