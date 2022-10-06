package week1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false; 
		for (int i = 2; i < input; i++) {
			if (input % i == 0 ) {
				System.out.println("This not prime number");
				flag= true;
			}
			
			if(flag) {
				System.out.println("This is prime number");
			}
		}
	}
}
