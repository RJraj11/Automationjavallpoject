package Oopsconcept;

public class Child2 extends Parent{
	
	public void cry () {
		System.out.println("child cry");
	}

	public static void main(String[] args) {
		
		Child2 c = new Child2 ();
		
		//child property
		c.cry();
		
		//parent property
		c.land();
		c.cash();
		
	} 
}
