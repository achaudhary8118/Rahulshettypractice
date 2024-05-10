package programs.AmolKoshtipdf;

public class IndexOfExample {
	
	public static void main(String[] args) {
		String s1="this is index of example"; 
		String s3 = "Hi my name is Amit";
		String s5="meklo"; 
		String s6="hemlo"; 
		System.out.println(s5.compareTo(s6));
		
		
		//passing substring 
		int index1=s1.indexOf("is");//returns the index of is substring 
		int index2=s1.indexOf("of");//returns the index of index substring 
		System.out.println(index1+" "+index2);//2 8 
		String myStr = "Hello planet earth, you are a great planet.";
	    System.out.println(myStr.indexOf("e", 5));
	    int index4=s1.indexOf('s');//returns the index of s char value 
	    System.out.println(index4);//3 
	    String s2="My name is Rajendra. My name is lamror. My name is Technolamror."; 
	    String replaceString=s2.replaceAll("is","was");//replaces all occurrences of "is" to "was" 
	    System.out.println(replaceString); 
	    
	    String s7="java string split method by Technolamror"; 
	    String[] words=s7.split("\\s");//splits the string based on whitespace 
	    //using java for each loop to print elements of string array 
	    for(String w:words){ 
	    System.out.println(w); 
	    }
	    String s8=" hello string "; 
	    System.out.println(s8+"Technolamror");//without trim() 
	    System.out.println(s8.trim()+"Technolamror");//with trim()

		String s9="TECHNOLAMROR by Rajendralamror HELLO stRIng"; 
		String s9lower=s9.toLowerCase();
		System.out.println(s9lower);
	    }
		
	
	
	

}
