package Practice;

public class palindrom {

	public static void main(String[] args) {
		String num = "ABA";
		String string = String.valueOf(num);

		System.out.println(new StringBuffer(string).reverse().toString().equals(string));

	}

}
