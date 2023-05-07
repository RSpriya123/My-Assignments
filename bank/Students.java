package bank;

public class Students {
	
	public void getStudentInfo (int stuNo)
	{
		System.out.println("Student ID" + stuNo);
	
	}
	
	public void getStudentInfo(int stuNo , String Name)
	{
		System.out.println (stuNo + Name);
	
	}
	
	public void getStudentInfo(String email , long Phone )
	{
		System.out.println(email + Phone);
	
	}
	

	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(1234);
		obj.getStudentInfo(1234,"Priya");
		obj.getStudentInfo("xyz@gmail.com", 12345678);
		
	}

}
