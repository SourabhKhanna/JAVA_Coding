package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobile {
	public static void main(String[] args) {
		String num = "9876543210";

		String regex = "(0|91)+[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(num);

		
		System.out.println(matcher.matches());

	}

}
