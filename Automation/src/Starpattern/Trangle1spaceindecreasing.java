package Starpattern;

public class Trangle1spaceindecreasing {

	public static void main(String[] args) {
		
		for (int b=1; b<=6 ; b++)// b=2
		{
			for (int c=5; c>=b; c--) //creating space in decressing order b=2,3,4,5,6
			{
				System.out.print(" " );
			}
			for (int a=1; a<=b; a++) //creating star pattern b=2
				{
				System.out.print("*");
		}
			System.out.println();
			}
	}

}