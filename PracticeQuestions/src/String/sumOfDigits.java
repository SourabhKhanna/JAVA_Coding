package String;

public class sumOfDigits {
	public static void main(String[] args) {
		String string="ab5c2d4ef12s";
		int sum=0;
		for(int i=0;i<string.length();i++) {
			if(Character.isDigit(string.charAt(i))) {
				sum+=Integer.parseInt(""+string.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
