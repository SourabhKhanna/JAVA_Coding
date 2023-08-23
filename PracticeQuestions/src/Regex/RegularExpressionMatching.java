package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
        Pattern pattern=Pattern.compile(p);
        Matcher matcher=pattern.matcher(s);
        return matcher.matches();
        
    }
	
	public static void main(String[] args) {
		
		 System.out.println(isMatch("aa", "a"));
		 
		 
		 
	}

}
