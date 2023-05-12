package quiz05;

public class Computer extends Calculator{

	
	double circle(int c) {
	//	pi = Math.PI * c * c;
		return c * c * Math.PI;
	}
	
	double rect(double a) { // 정사각형의 넓이
		//System.out.println(a*a);
		return a * a;
	}
	double rect(double a, double b) { // 직사각형의 넓이
		//System.out.println(a*b);
		return a * b;
	}
	double rect(double a, double b, double  c) { // 직육면체의 넓이
		//System.out.println(a*b*c);
		return a * b * c;
	}

	
	
	
//	 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
//	 * rect(double) : double - 정사각형의 넓이 를 리턴
//	 * rect(double, double) : double - 직사각형의 넓이 를 리턴
//	 * rect(double, double, double) : double - 직육면체의 넓이 를 리턴

	
}
