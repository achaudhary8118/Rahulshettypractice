package programs.AmolKoshtipdf;

public class StringMethods {
	
	  String x = "Hello Welcome to Java Selenium", y= " string" , z = " Method program";
	  
	  void nonstaticmethod()
	  {
		  System.out.println("I am non static menthod");
	  }
	
	public static void main(String[] args) {
		
		 String concatinatestring,ReplaceString = "";
		
		StringMethods obj = new StringMethods();
		
		obj.nonstaticmethod();
		
		System.out.println(obj.x.length());
		
		concatinatestring = obj.x.concat(obj.y.concat(obj.z));
		
		System.out.println(concatinatestring);
		
		ReplaceString = obj.x.replace("Hello", "Hi");
		
		System.out.println("ReplaceString:" + ReplaceString);
		
	}
}
