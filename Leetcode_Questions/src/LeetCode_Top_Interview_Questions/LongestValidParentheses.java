package LeetCode_Top_Interview_Questions;

import java.util.Stack;

//Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
//substring
//.
public class LongestValidParentheses {

	 public static int longestValidParentheses(String s) {
		 Stack<Character> stack=new Stack();
		 int result=0;
//	      )()(
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='(' || s.charAt(i)==')') {
				 stack.push(s.charAt(i));
			 }
			 else  {
				if(stack.peek()==')') {
					
				}
			 }
		 }
		return result;
	        
	  }
	public static void main(String[] args) {
		Stack<Character> stack=new Stack();
		stack.push('(');
		stack.push(')');
//		System.out.println(longestValidParentheses(")()())"));
	}
}
