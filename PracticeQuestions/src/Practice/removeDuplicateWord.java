package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class removeDuplicateWord {
	public static void main(String[] args) {
		String string="Java is java language";
		String[] words = string.split("\\s+");
		System.out.println(Arrays.stream(words)
                .distinct()
                .collect(Collectors.joining(" ")));
	}

}
