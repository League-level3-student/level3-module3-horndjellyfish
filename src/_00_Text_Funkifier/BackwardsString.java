package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	public String funkifyText(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		return sb.toString();
	}

}
