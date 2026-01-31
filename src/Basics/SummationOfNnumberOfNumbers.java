package Basics;

public class SummationOfNnumberOfNumbers {

	public static int sum(int... numbers) { // this is the syntax to memorize

		int total = 0;

		for (int n : numbers) {
			total = total + n;
		}

		return total;
	}

	public static void main(String[] args) {

		System.out.println(sum(3, 5, 6, 8));

	}

}
