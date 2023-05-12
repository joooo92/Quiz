package quiz02;

public class Tv {

	String company = "LG"; //회사
	int channel; // 채널
	boolean power; // 전원
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 x번을 받아서 채널을 변경, 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지는 동작될 수 있도록
	 * 
	 */
	
	
	int changeChannel(int x) {
		channel = x;
		
		return channel;
	}
	
	void power() {
		if(power == false) {
			power = true;
			System.out.println("킵니당");
		}else {
			power = false;
			System.out.println("끕니당");
		}
	}
	
	
	
	
	
}
