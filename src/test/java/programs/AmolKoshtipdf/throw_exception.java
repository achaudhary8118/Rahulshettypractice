package programs.AmolKoshtipdf;

public class throw_exception {
	
	static void validate(int age){ 
		 if(age<18) 
		 throw new ArithmeticException("not valid"); 
		 else 
		 System.out.println("welcome to vote on Technolamror"); 
		 } 
		 public static void main(String args[]){ 
		 validate(13); 
		 System.out.println("rest of the code..."); 
		 } 

}
