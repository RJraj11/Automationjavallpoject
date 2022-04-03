package oops_inheritance;

public class Second extends First{

	static int e=50;
//private int f=60;
	protected int g=70;
	public int h=80;
	
	public static void main(String[] args) {
		
		System.out.println(First.a);
		
		Second y= new Second();
		
//System.out.println(x.b);
	
		System.out.println(y.g);//value70
		System.out.println(y.h);//value 80
		System.out.println(y.c);//value 30
	}
		
		
	}
	
	
		

