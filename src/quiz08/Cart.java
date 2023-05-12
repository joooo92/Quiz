package quiz08;

public class Cart {
	
	String[] cart = new String[1];    // String str = "홍길동"; ^랑 다를게 없뎅.,,,, 다른디......
	int money; // 가진돈
	int i = 0; //cart의 순서
	
	Cart(){}
	
	int tv;
	int compu;
	int radio;
	
	void buy(String product) {
		System.out.println("구매할 수 있는 항목은 " + tv + ", " + compu + ", " + radio + " 입니다.");
	}
	
	void add(String product) {
		System.out.println("재정의 하세요");
	}
	
	void info(String product) { // 카트에들어있는물건 구매한물건 총금액 남은금액
		
		
		System.out.println("재정의 하세요");
	}
	
	
	
	
	

}
