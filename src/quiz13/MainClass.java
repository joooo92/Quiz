package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		Shape c = new Circle("원", 5);		
		System.out.println(c.getName());
		System.out.println(c.getArea());

		Shape r = new Rect("정사각", 5);
		System.out.println(r.getName());
		System.out.println(r.getArea());
		
	}

}
