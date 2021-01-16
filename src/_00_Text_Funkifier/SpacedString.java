package _00_Text_Funkifier;

public class SpacedString extends SpecialString{

	public SpacedString(String s) {
		super(s);
		
	}

	public String funkifyText(String s) {
		s = s.replaceAll(".(?=.)", "$0 ").trim();
		return s;
	}

}
