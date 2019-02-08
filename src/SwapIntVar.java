
public class SwapIntVar {

	public static void main(String args[])
	{
		int x=5;
		int y=2;
		
		/*	x=x+y; //7
			y=x-y;//5
			x=x-y;//2;
			System.out.println(x);
			System.out.println(y);
		*/	
/*		x=x*y; //10
		y=x/y;	 //5
		x=x/y; //2
		System.out.println(x);
		System.out.println(y);
*/
		x=x^y;//
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		
		}
}
