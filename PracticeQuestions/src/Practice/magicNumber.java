package Practice;

public class magicNumber {
	public static void main(String[] args) {
		int num=12345;
		
		int temp=0;
		
		int ans=0;				
		while(num!=0) {
			temp+=num%10;
			num/=10;
		}
		System.out.println(temp);
		
	}

}
