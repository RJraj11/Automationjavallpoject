package Oopsconcept;

public class Child1 extends Parent {
	
	public void cycle() {
		System.out.println("Childs cycle");
	}
	public static void main(String[] args) {
		
		Child1 	c = new Child1();
		
		c.cycle();
		
		c.cash();
		c.land();
	}

	
}
