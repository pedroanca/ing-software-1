package ico.fes;

public class Alcatel implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public Alcatel(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}
}