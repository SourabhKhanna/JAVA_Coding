package Practice;

public class reverseWordsOfString {
	public static String reverseWords(String input) {
		StringBuilder reverse = new StringBuilder();
		int length = input.length();
		int end = length;
		for (int i = length - 1; i >= 0; i--) {
			if (input.charAt(i) == ' ') {
				reverse.append(input, i + 1, end).append(' ');
				end = i;
			}
		}

		reverse.append(input, 0, end);

		return reverse.toString();
	}

	public static void main(String[] args) {
		String string = "today is monday";
		System.out.println(reverseWords(string));
	}

}
