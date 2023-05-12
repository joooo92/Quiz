package quiz03;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		
//	String color;
//	String model;
	int channel;
	
	DmbPhone (String mo, String col, int ch){
		model = mo;
		color = col;
		channel = ch;
	}
		
		
		
	void turnOnDmb() {
		System.out.println("TV를 켭니다.");
	}
	
	int changeChannel(int a) {
		channel = a;
		System.out.println(channel + " 로 채널을 변경합니다.");
		return channel; 
	}
	
	void turnOffDmb() {
		System.out.println("TV를 끕니다");
	}
	
//	void powerOff() {
//		System.out.println("전원을 끕니다.");
//	}
//	


}
