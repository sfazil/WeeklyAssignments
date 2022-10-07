package week1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 6;
		boolean flag = false; 
		for (int i = 2; i < input; i++) {
			if (input % i == 0 ) {
				flag= true;	
			}
		}
		if(flag) {
			System.out.println("This is not a prime number");
		}
		else {
			System.out.println("This prime number");
		}
	}
}
