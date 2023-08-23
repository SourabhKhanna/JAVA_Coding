package Regex;

import java.util.regex.Pattern;

public class ValidateEmail {
	public static void main(String[] args) {
		String email="s@gmail.com";
		String regex="[a-zA-Z][a-zA-Z0-9]*+@gmail.com";
		System.out.println(Pattern.matches(regex, email)); 
		
	}

}
