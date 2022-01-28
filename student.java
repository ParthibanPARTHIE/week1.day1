package week1.day1;

public class student {

	String studentName = "Parthiban";
	int    rollNumber  = 24;
	
	private String college() {
		String collegeName = "GTEC";
		return collegeName;
	
	}
	void deptName(String name) {
		System.out.println("DEPARTMENT   :"+name);
	}
	
	public static void main (String [] args) {
		student studentdetails = new student();
		System.out.println("    STUDENT DETAILS  ");
		String collegedetail = studentdetails.college();
		System.out.println("COLLEGE NAME :" + collegedetail);
		System.out.println("STUDENT NAME :" + studentdetails.studentName);
		System.out.println("ROLL NUMBER  :" + studentdetails.rollNumber );
		studentdetails.deptName("MECHANICAL");
		
		
		
		
		

	
	
}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	       
	
}


