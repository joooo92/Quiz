package quiz15;

public class MainClass {
	public static void main(String[] args) {
		IBag bag = new Shop();
		
		bag.insert("TV");
		bag.insert("TV");
		bag.insert("TV");
		bag.insert("radio");
		bag.insert("radio");
		
		bag.print();
		
		System.out.println();
		
		System.out.println(bag.search("radio"));
		
		System.out.println(bag.delete("radio"));
		bag.print();
		
		
		
	}

}
