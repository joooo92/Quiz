package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		
		Radio r = new Radio();
//		System.out.println(r.getPrice());
//		System.out.println(r.getName());
		Tv t = new Tv();
		Computer com = new Computer();
		
		
		MyCart mc = new MyCart(1200);
		mc.buy(t);
		mc.buy(t);
		mc.buy(r);
		mc.buy(com);
		
		mc.info();
	
		
		
	
		
		
		
		
	}

}
