package ico.fes;

public class MobileFactory {
	public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("Intel");
		}else if(type.equals(Mobile.MOTOROLA)){
			return new Motorola(3, "A8", "A8 GPU");
                }else if(type.equals(Mobile.ALCATEL)){
			return new Alcatel(3, "A7", "A7 GPU");
                }else if(type.equals(Mobile.LENOVO)){
			return new Lenovo(3, "A6", "A6 GPU");
                }else
                        {
			return null;
		}
	}
}
