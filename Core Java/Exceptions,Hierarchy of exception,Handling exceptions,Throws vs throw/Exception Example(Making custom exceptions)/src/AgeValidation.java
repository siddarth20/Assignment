class MyExcep extends Exception
{
	private String s;
	
	MyExcep(String s){
		this.s = s;
	}
	
	public String toString() {
		return "MyExcep["+s+"]";
	}
	
}

public class AgeValidation {
	static void valid(int age) throws MyExcep
	{
		if(age<18)
		{
			throw new MyExcep("You are not eligible");
		}
	}
	public static void main(String[] args) {
		try
		{
			valid(15);
		}
		catch(MyExcep e)
		{
			System.out.println(e); //overidden the toString method of Throwable class which is called by println()
		}

	}

}
