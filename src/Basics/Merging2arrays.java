package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Merging2arrays {

	static int k = 0;

	public static void main(String[] args) {

		int arr1[] = { 2, 1, 45, 6 };
		int arr2[] = { 10, 9, 24, 5 };

		int length_of_arr1 = arr1.length;
		int l1 = arr1.length + arr2.length;

		int merged[] = new int[l1];

		// Copy arr1
		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}

		// Copy arr2
		for (int i = length_of_arr1; i < merged.length; i++) {
			merged[i] = arr2[k];
			k++;
		}

		int largest = merged[0];
		int smallest = merged[0];

		for (int i = 1; i <= merged.length -1; i++) {
			if (merged[i] > largest) {
				largest = merged[i];
			} 
			else if (merged[i] > smallest) {
				smallest = merged[i];
			}

		}
		System.out.println(Arrays.toString(merged));
		
		System.out.println("smallest: "+smallest + " / Largest: " + largest);

	}

}
