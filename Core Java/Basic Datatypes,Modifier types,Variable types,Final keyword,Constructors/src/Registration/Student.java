package Registration;

public class Student {
	
	public String name;
	final String collegeName = "VESIT"; //cannot be modified once declared
	private String branchCode; //can be accessed only by getters and setters
	final static String universityName = "MU"; //all objects will share one copy of the variable universityName
	int rollNo;
	
	public Student(String name,int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		if(branchCode.equals("CMPN") || branchCode.equals("IT")) {
		this.branchCode = branchCode;
		}
		else {
			System.out.println("Please enter correct branch code");
		}
	}
	
}
