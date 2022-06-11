package polymorphism;

public class Demo {

	public static void main(String[] args) {
		Phone samsung = type(1);
		Phone nokia = type(2);
		System.out.println("Samsung model:-"+samsung.getModel());
		samsung.features(); //features() of class Samsung will be invoked
		System.out.println("Nokie model:-"+nokia.getModel());
		nokia.features(); //features() of parent class i.e. Phone will be invoked

	}
	
	public static Phone type(int type) {
		switch(type) {
		case 1:return new Samsung("note 5");
		case 2: return new Nokia("3310");
		}
		return null;
		
	}

}
