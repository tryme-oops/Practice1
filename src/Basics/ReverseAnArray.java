package Basics;

import java.util.Arrays;

public class ReverseAnArray {
	static int k = 0;
	
	public static int[] reverse(int arr[]) {

		int rev[] = new int[arr.length];
		
		for(int i = arr.length -1; i >= 0  ; i--) {
			rev[k] = arr[i];
			k++;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		int arr[] = {2, 7, 9,10};
		System.out.println(Arrays.toString(reverse(arr)));

	}

}
