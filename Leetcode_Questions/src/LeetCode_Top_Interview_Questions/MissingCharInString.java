package LeetCode_Top_Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class MissingCharInString {
	
	private static String getMissingChar(String str){
		str=str.toLowerCase();
		int length = str.length();
		int[] arr = new int[length];
		for(int i=0;i<length;i++){			
			char c = str.charAt(i);
			arr[i]=(int)c;
		}
		Arrays.sort(arr);
		int count=0;
		while(count<length){			
			int first = arr[0];
			if(str.indexOf(first+count)>=0){
				count++;
				continue;
			}else{
				return String.valueOf(Character.toChars(first+count));
				
			}
		}
		return "";		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String string=scanner.nextLine();
		System.out.println(getMissingChar(string));
		
		
		
		
	}

}
