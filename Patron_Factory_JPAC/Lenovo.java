package ico.fes;

public class Lenovo implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public Lenovo(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}
}