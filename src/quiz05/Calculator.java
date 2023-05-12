package quiz05;

public class Calculator { // 부모클래스

	int result;
	double pi = 3.14; //3.14
	
//	* Calculator의 멤버변수 result, pi를 선언하세요
	
	void add(int a) {
		//System.out.println(result);
		result += a;		
	}
	
	void sub(int b) {
		//System.out.println(result);
		result -= b;
	}
	
	double circle (int c) { // c = 반지름 , 원의 넚이 = 3.14 * c * c
//		pi = pi * c * c;
//		System.out.println(pi);
		return c * c * pi;
	}
	
	
	
	
	
//	
//	 * add(int) : void - result에 값을 누적시키는 기능
//	 * sub(int) : void - result에 값을 차감시키는 기능
//	 * circle(int) : double - pi를 이용해서 원의 넓이를 구하는 기능
//	
	
}
