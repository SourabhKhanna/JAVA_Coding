package String;

public class rotaionString {
	public static final  void main(String[] args) {
		String string = "Sourabh";
		String string2 = "rabhSou";
		int i=0;
		int index = string2.indexOf(string.charAt(0));
		if (string.contains(string2.substring(index, string2.length()))) {
			System.out.println("Half");
		}
		
		

	}

}
