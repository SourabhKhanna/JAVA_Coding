package String;

public class firstHalf {
	public static void main(String[] args) {
		String string="WooHoo";
		String temp="<<<>>>";
		System.out.println(temp.substring(0,temp.length()/2)+string+temp.substring(temp.length()/2,temp.length()));
	}

}
