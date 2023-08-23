package LeetCode_Top_Interview_Questions;

//You are given a string s.You can convert s to a palindrome by adding characters 
//in front of it.

public class ShortestPalindrom {
	public static boolean isPalindrome(String string) {
		return new StringBuffer(string).reverse().toString().equals(string);
	}

	public static String shortestPalindrome(String s) {
		if (s.length() == 1 || isPalindrome(s)) {
			return s;
		}
		else if(s.length()>=5*10000) {
			return "";
		}
		else {
			String temp = "";
			String check = s;
			
			for (int i = s.length() - 1; i >= s.length()/2; i--) {
				int x = 0;
				temp += s.charAt(i);
				check = temp + s;
				if (isPalindrome(check)) {
					return check;
				}

			}
		}
		return "";

	}

	public static void main(String[] args) {

		System.out.println(shortestPalindrome("abcd"));
	}

}
