package String;

public class Memory {
	
	public static void main (String[] args) {
		
		String a = "Velocity";
		String b = "Velocity";
		
		String c = new String ("Velocity");
		String d = new String ("Velocity");
		
		System.out.println(a == b);
		System.out.println(c == d);
		
		b = "class";
		
		System.out.println(a);
		System.out.println(b);

	System.out.println(a == b);
	
	b = "Velocity";
	System.out.println(a == b);
 	
	}
	

}
