package quiz06;

public class Account {

	// 한 사람의 은행 계좌
	/*
	 * accountNumber변수 - 식별아이디
	 * password - 비밀번호
	 * balance변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit : void - 잔고에 매개변수를 누적하는 기능 (입금)
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능 (출금)
	 * getBalance : int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서는 각각의 기능을 확인
	 * 
	 */
	
	String accountNumber;
	int password;
	int balance;
	
	Account() {} // 기본생성자!
	
	
//	Account(){
//		accountNumber = "1234-56789";
//		password = "0000";
//		balance = 50000;
//	}
	
	Account(String acc, int pass, int bal){
		accountNumber = acc;
		password = pass;
		balance = bal;
	}
	
	void info() {
		System.out.println("=====계좌정보=====");
		System.out.println("식별아이디: " + accountNumber);
		System.out.println("비밀번호: " + password);
		System.out.println("잔고: " + balance);
	}
	
	
	void deposit(int a) {
		//매개변수가 양수일때만 가능하도록 변경
		if(a > 0) {
			balance += a;
			System.out.println("입금액은 " + a + " 입니다.");
			System.out.println("잔고는 " + balance);
		} else {
			System.out.println("입금액을 확인해주세요");
		}
	}
	
	void withDraw(int b) {
		//매개변수가 잔고보다 작을때만 출금이 가능하도록 변경
		if(balance >= b) {
		balance -= b;
		System.out.println("출금액은 " + b + " 입니다.");
		System.out.println("잔고는 " + balance);
		} else {
			System.out.println("출금액은 " + b + " 입니다.");
			System.out.println("잔고가 부족합니다.");
		}
		
	}
	
	int getBalance() {
		
		return balance;
	}
	
	
	
}
