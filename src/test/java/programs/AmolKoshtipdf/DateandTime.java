package programs.AmolKoshtipdf;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

public class DateandTime {
	
	public static void main(String[] args) throws Exception { 
		 long millis=System.currentTimeMillis(); 
		 java.sql.Date date=new java.sql.Date(millis); 
		 System.out.println(date); 
		 
		 int c;
		 Random t = new Random();
		 // random integers in [0, 100]
		 for (c = 1; c <= 10; c++) {
		 System.out.println(t.nextInt(100));
		 }
		 

	Runtime rs = Runtime.getRuntime();
	 System.out.println("Free memory in JVM before Garbage Collection = 	"+rs.freeMemory());
	 rs.gc();
	 System.out.println("Free memory in JVM after Garbage Collection = 	"+rs.freeMemory());
	 
	
	System.out.println(InetAddress.getLocalHost());

	
	
	Runtime rs1 = Runtime.getRuntime();
	 try {
	 rs1.exec("notepad");
	 }
	 catch (IOException e) {
	 System.out.println(e);
	 } 
	}
	 
}
