package pack2;

import pack3.GraphicsCard;
import pack3.Processor;
public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String keyboard;
	
	public Laptop() {

		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "1TB";
		this.graphicsCard = new GraphicsCard();
		this.keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String keyword) {
		
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.keyboard = keyboard;
	}
	
	public Processor getProcessor() {
		return processor;
	}

	@Override
	public String toString() {
		return "laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", keyboard=" + keyboard + "]";
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	
	public String getKeyboard() {
		return keyboard;
	}
	
	public void gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
	}
	
}
