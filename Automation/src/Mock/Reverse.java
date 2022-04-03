package Mock;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s="I LOVE VELOCITY";
				String r="";
				int b=s.length();
				for (int i=b-1; i>=0; i--)
				{
					r= r + s.charAt(i);
					
				}
				System.out.println(r);
		
	}


}