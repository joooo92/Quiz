package quiz13;

public class Rect extends Shape{

	/*
	 * 사각형은 side변수를 가집니다.
	 * 사각형은 생성될 떄 이름과 side를 받을 수 있도록 생성자 선언
	 * getArea() = 사각형의 넓이를 구하도록 오버라이딩
	 */
	
	private double side;
	
	public Rect(String name, double side) {
		super(name);
		this.side = side; 
	}

	@Override
	public double getArea() {
		return side * side;
	}
	

}
