package programs.AmolKoshtipdf;

public class Constructor_Overlodding {
	
	String name;
	Constructor_Overlodding() {
	 System.out.println("Constructor method called.");
	 }
	Constructor_Overlodding(String t) {
	 name = t;
	 }
	 public static void main(String[] args) {
	 Constructor_Overlodding cpp = new Constructor_Overlodding();
	 Constructor_Overlodding java = new Constructor_Overlodding("Java");
	 cpp.setName("C++");
	 java.getName();
	 cpp.getName();
	 }
	 void setName(String t) {
	 name = t;
	 }
	 void getName() {
	 System.out.println("Language name: " + name);
	 }


}
