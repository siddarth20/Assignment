package interfaces;

public class Samsung implements Phone {

	@Override
	public String processor() {
		return "835";
	}

	@Override
	public String ram() {
		return "12GB";
	}

	@Override
	public int camera() {
		return 48;
	}

}
