package Starpattern;

public class Trangle1starpyramidspaceindecrese {

	public static void main(String[] args) {
		
		for(int b=1; b<=6; b++) //creating how many line in pattern
		{
			for (int c=5; c>=b; c--) // creating in decreaing order.
			{
				System.out.print(" ");
			}
			for (int a=1; a<=(b*2)-1; a++)// creating star pattern
			{
				System.out.print("*");
			
			}
			System.out.println();
			}
		}
	
}
