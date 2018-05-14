package ico.fes;

public class Motorola implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public Motorola(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}
}