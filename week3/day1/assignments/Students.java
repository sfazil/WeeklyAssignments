package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id){
		System.out.println("The id is:" + id);
		
	}
	public void getStudentInfo(int id, String name){
		System.out.println("The id is:" + id+ "The name is:"+name);
		
	}
	public void getStudentInfo(String email, String phone){
		System.out.println("The email is:"+email + "The phone number is"+phone);
	}
	

	public static void main(String[] args) {
		
		Students info = new Students();
		info.getStudentInfo(123);
		info.getStudentInfo(123, null);
		info.getStudentInfo("test@gmail.com", "9000000000");
		

	}

}
