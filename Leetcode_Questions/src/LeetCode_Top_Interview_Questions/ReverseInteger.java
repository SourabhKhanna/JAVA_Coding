package LeetCode_Top_Interview_Questions;

public class ReverseInteger {
	public static int reverse(int x) {
        long temp=0;
        while(x!=0) {
		int a=x%10;
		temp=temp*10+a;
		x/=10;
	}
   return (int) ((temp < -2147483648L || temp > 2147483648L)? 0: temp);
    }
public static void main(String[] args) {
	int x=-123;
	
	System.out.println(reverse(x));
}
}
