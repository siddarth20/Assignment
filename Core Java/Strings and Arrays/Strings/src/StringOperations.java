
public class StringOperations {

	public static void main(String[] args) {
		String name = "Siddarth"; //only 1 string object is created
		String name1 = new String("Siddarth"); //2 objects are created
		System.out.println(name.length());
		System.out.println(name.substring(3,7));
		System.out.println(name.contains("dart"));
		System.out.println(name.replace('i','s'));
		System.out.println(name.equals(name1));
		System.out.println(name==name1);
		System.out.println(name.indexOf("dart"));
		StringBuffer name2 = new StringBuffer("Siddarth"); //mutable Strings
		System.out.println(name2.replace(3,7,"hetr"));
		System.out.println(name2);
	}

}
