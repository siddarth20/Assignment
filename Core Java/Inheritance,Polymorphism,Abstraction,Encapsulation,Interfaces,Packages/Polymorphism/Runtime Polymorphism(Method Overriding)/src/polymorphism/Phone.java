package polymorphism;

public class Phone {
	private String model;

	public Phone(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void features() {
		System.out.println("This is a feature phone");
	}
}
