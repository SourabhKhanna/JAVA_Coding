package Practice;

import java.util.stream.Collectors;

public class Test {
	public int nearestNumber(int num, int m) {
		int result = 0;
		for (int i = num;; i++) {
			if (i % m == 0) {
				result = i;
			}
		}
	}

	String mergeString(String str1, String str2) {

		char arr[] = new char[str1.length() + str1.length()];

		return arr.toString();
	}

	public static void main(String[] args) {
		String string = "aeiouuiygyjh";
		String vowel = "aeiou";
		System.out.println(
				string.toLowerCase().chars().mapToObj(c -> (char) c).filter(c -> vowel.contains(c.toString())).count());

		System.out.println(string.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(p -> vowel.contains(string), Collectors.counting())));
	}
}
