package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	public String funkifyText(String s) {
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		for (int i = 1; i < s.length(); i += 2) {
			sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
		}
		return sb.toString();
	}

}
