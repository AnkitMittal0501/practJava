
public class ReplaceJunkfromString {
	public static void main (String args[])
	{
		String s="@@#@#@ String 1231656512";
		String s1="aDASAdsa@#@#@#ASADDA@#@#@"
;		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
		s=s.replaceAll("[0-9]","");
		System.out.println(s);
	}
}
