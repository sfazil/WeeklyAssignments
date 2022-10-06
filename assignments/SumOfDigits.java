package week1.assignments;

public class SumOfDigits {
	public static void main(String[] args) {
		int input = 12345;
		int add = 0;
		while (input > 0) {
			int rem = input % 10;
			add = add + rem;
			input = input / 10;

		}
		System.out.println("The sum of the digits is " + add);
	}

}
