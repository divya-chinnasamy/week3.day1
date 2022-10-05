package week3.day1;

public class StudentDetails {

	public void getStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is student info method without arguments");
	}
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("This is student id :" + id);
	}
	
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Student id: " +id +" Student name: " + name);
	}
	
	public void getStudentInfo(String phone,String email ) {
		// TODO Auto-generated method stub
		System.out.println("The Student phone number: " + phone +" Student email: " +email);
	}
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.getStudentInfo();
		sd.getStudentInfo(101);
		sd.getStudentInfo(101, "Divyaprabha");
		sd.getStudentInfo("9994100179", "divya.chinnasamy@gmail.com");
	}

}
