package week3.day1.assignments;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Axis Bank Deposit");
		super.deposit();
	}
	
	
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
		
		
	}
	
	
}
