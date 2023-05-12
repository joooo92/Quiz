package quiz02;

public class TvMain {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		int channer = tv.changeChannel(27);
		System.out.println(channer);
		
		tv.power();
		tv.power();
		tv.power();
		
		
		
	}

}
