package pack1;
import pack2.Laptop;
import pack3.Processor;
import pack3.GraphicsCard;
public class CreateLaptop {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println("Processor Brand:-"+lappy.getProcessor().getBrand());
		
		Processor processor = new Processor("intel","7200U",7,4,4,"6MB","2.5GHz","2.5Ghz","3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia",1050,"4GB");
		
		Laptop gamingLaptop = new Laptop(17f,processor,"DDR4","2TB",graphicsCard,"backlit");
        System.out.println("Gaming Laptop Specs:-"+gamingLaptop);

        gamingLaptop.gamingMode();
        System.out.println("Gaming Mode on");
        System.out.println("Current Frequency "+gamingLaptop.getProcessor().getFrequency());

	}

}
