package Basics;


public class BasicArraySorting {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 3, 14, 4, 7, 18 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

		}

		for (int i : arr) {
			System.out.println(i);

		}

	}

}
