package programs.AmolKoshtipdf;

import java.util.Scanner;

public class Ifelsecause {
	
	public static void main (String[] args)
	{
		int passingmarks, marksobtained;
		char grade = 0;
		boolean learning = true;
		 if (learning) {
		 System.out.println("Java programmer");
		 }
		 else {
		 System.out.println("What are you doing here?");
	}
		 
		 passingmarks = 40;
		 
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the marks which is obtained:");
		 marksobtained = in.nextInt();
		 
		 if (marksobtained>=passingmarks)
		 { 
			 if (marksobtained >= 90)
			 grade = 'A';
			 else if (marksobtained > 75)
			 grade = 'B';
			 else if (marksobtained > 60)
			 grade = 'C';
			 else 
			grade = 'D';
		System.out.println("You are Passed with grade:" + grade);
		 }
		 else
		System.out.println("You are Failed"); 
		 in.close();

}
}