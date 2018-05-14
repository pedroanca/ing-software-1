package ico.fes;

public class Exec {
	 public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
                System.out.println(mobile);
                Mobile mobile1 = MobileFactory.createMobile(Mobile.MOTOROLA);
                System.out.println(mobile1);
                Mobile mobile2 = MobileFactory.createMobile(Mobile.LENOVO);
                System.out.println(mobile2);
                Mobile mobile3 = MobileFactory.createMobile(Mobile.ALCATEL);
                System.out.println(mobile3);
                Mobile mobile4 = MobileFactory.createMobile(Mobile.SONY);
                System.out.println(mobile4);
                Mobile mobile5 = MobileFactory.createMobile(Mobile.IPHONE);
                System.out.println(mobile5);
                
                

	}
}
