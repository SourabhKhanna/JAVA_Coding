package String;

public class reverseWordsInSTring {
	public static void main(String[] args) {

		String string = "My name is sourabh khanna";
		StringBuilder builder = new StringBuilder(string);
		builder = builder.reverse();
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == ' ') {
				System.out.print(temp.reverse()+" ");
				temp = new StringBuilder("");
				continue;
			}

			else {
				temp.append(builder.charAt(i));
			}
		}

		System.out.print(temp.reverse());

	}

}
