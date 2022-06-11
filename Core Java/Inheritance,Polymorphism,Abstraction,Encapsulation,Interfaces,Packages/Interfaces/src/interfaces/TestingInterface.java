package interfaces;

public class TestingInterface {

	public static void main(String[] args) {
		Phone samsung = new Samsung(); //reference type of parent class(Phone) but object is of class Samsung.
		System.out.println("Processor type:-"+samsung.processor());
		System.out.println("Ram:-"+samsung.ram());
		System.out.println("Camera(mp):-"+samsung.camera());

	}

}
