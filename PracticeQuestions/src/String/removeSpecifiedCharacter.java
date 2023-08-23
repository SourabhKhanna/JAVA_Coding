package String;

import java.util.stream.Collectors;

public class removeSpecifiedCharacter {
	public static void main(String[] args) {
		String string = "abcdefabcdeabcdaaa";
		char c = 'a';
		String result = "";

		for (char x : string.toCharArray()) {
			if (x != c)
				result += x;
		}

		System.out.println(result);
	}

}
