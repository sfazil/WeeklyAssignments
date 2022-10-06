package week1.assignments;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int original = 153;
		int remainder ;
		int calculated=0;
		int num = original;
		
		while (num > 0) {
			remainder = num % 10;
			calculated = calculated+ remainder*remainder*remainder;
			num = num / 10;	
		}
		if (original == calculated) {
			System.out.println("yes "+original+" is an armstrong number");
			
		} else {
			System.out.println("no the number is not armstrong");

		}
	
		
	}

}
