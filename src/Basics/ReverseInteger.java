package Basics;

public class ReverseInteger {

	public int ReverseInt(int a) {
		int rev = 0;
		
		while(a != 0) {
			rev =  rev*10 + a % 10 ;
			a = a/10;
		}
		return rev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseInteger a = new ReverseInteger();
		int rev = a.ReverseInt(123456);
		System.out.println(rev);
	}

}

