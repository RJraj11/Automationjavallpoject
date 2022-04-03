package oops_inheritance;

public class Third extends Second {
	
	static int i=90;
	//private int j=100;
	protected int k=110;
	public int l=120;
	
	public static void main(String[] args) {
		
		System.out.println(First.a);//call static int value a is  10
		
		Third z= new Third ();
		
		System.out.println(z.g);//value 70
		System.out.println(z.k);//value 110
		System.out.println(z.d);//40
		
			
	}
}
