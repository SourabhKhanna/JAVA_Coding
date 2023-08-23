package LeetCode_Top_Interview_Questions;

public class LongestPalindromicSubString {
	public static boolean isPalindrome(String string) {
		return new StringBuffer(string).reverse().toString().equals(string);
	}

	public static String longestPalindrome(String s) {
		String temp="";
		String result="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				try {
					temp=s.substring(i,j+1);
					if(isPalindrome(temp))  result=temp;
				} catch (Exception e) {
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Ans=="+longestPalindrome("a"));
	}
}
