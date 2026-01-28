package Basics;

public class LargestAndSmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 10, 20, 6, -34, 77, 0, 676, -10 };
		
		int smallest = numbers[0]; // assigning smallest variable with the value of 0th index of numbers[] array
		int largest = numbers[0]; // assigning largest variable with the value of 0th index of numbers[] array
	
		int lengthofArray = numbers.length;
		
		for (int i = 1; i < lengthofArray; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i]; 
			}

			else if (numbers[i] < smallest) {
			   smallest = numbers[i]; 
			}

		}
		
		System.out.println("\n smallest :" + smallest);
		System.out.println("\n largest :" + largest);

	}

}
