package week1.assignments;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1233456677;
	boolean isPunctured = true;
	String bikeName = "Pulsar";
	double runningKM= 233221234;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler obj = new TwoWheeler();
		int noWheels = obj.noOfWheels;
		System.out.println("Number of wheeles is "+ noWheels);
		short noMirros = obj.noOfMirrors;
		System.out.println("Number of mirror is "+ noMirros);
		long chassis= obj.chassisNumber;
		System.out.println("Chassis number is "+chassis);
		boolean puncutured = obj.isPunctured;
		System.out.println("Puncutured "+puncutured);
		String bName =obj.bikeName;
		System.out.println("Bike name "+bName);
		double km= obj.runningKM;
		System.out.println("Kilomter is "+ km);
		
		

	}

}
