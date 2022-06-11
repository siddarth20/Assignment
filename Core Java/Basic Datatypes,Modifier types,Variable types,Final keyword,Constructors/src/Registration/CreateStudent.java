package Registration;

import java.util.Scanner;

public class CreateStudent {

	public static void main(String[] args) {
		
		String branchCode;
		Student student = new Student("Siddarth",7);
		Scanner se = new Scanner(System.in);
		System.out.println("Enter your branch code");
		branchCode = se.next();
		student.setBranchCode(branchCode);
		System.out.println("Your details are:-"+student.name+" "+student.collegeName+" "+student.getBranchCode()+" "+Student.universityName+" "+"University Roll no is:-"+" "+student.rollNo);
	}

}
