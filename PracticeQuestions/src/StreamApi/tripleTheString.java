package StreamApi;

public class tripleTheString {
	public static void main(String[] args) {
		String string="capgemini";
		StringBuilder builder = new StringBuilder();
		for(char c :string.toLowerCase().toCharArray()) {
			builder.append(string.valueOf(c).repeat(3));
		}
		
		System.out.println(builder);
	}

}
