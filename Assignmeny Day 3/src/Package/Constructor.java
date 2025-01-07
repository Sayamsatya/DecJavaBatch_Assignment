package Package;

public class Constructor {

	 public Constructor() {
		 this (17, 19, 18);
	        System.out.println("default"); 
	 }
	    public Constructor(int a) {
	        this(); 
	        System.out.println("One Parameterized");
	    }

	    public Constructor(int a, int b) {
	        this(15); 
	        System.out.println("Two Parameterized");
	    }

	    public Constructor(int a, int b, int c) {
	       
	        System.out.println("Three Parameterized");
	    }

public static void main(String[] args) {
	
	Constructor c = new Constructor(11,13);
}
}

