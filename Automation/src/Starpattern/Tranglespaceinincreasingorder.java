package Starpattern;

public class Tranglespaceinincreasingorder {

	public static void main(String[] args) {
		
		for (int b=6; b>=1; b--)// craete how many line in pattern
		{
			for ( int c=5; c>=b; c--) //create space in incraesing order
			{
				System.out.print(" ");
			}
			for (int a=1; a<=b; a++) // creating star pattern
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
