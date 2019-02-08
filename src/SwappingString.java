import javax.swing.plaf.synth.SynthScrollBarUI;

public class SwappingString {

	public static void main(String args[])
	{
		String s="Hello";
		String r="World";
		s=s+r;
		System.out.println(s);
		r=s.substring(0, s.length()-r.length());
		s=s.substring(r.length());
		System.out.println(s);
	System.out.println(r);
	}
}
