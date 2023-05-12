package quiz02;

public class AccountMain {
	public static void main(String[] args) {
		
		Account Yoo = new Account("12345","7777",1000);
		
//		Yoo.info();
//		Yoo.deposit(10000);
//		System.out.println("입금금액은 " + a + " 입니다." + "계좌잔고: " + balance);
//		
//		Yoo.withDraw(5000);
//		System.out.println("출금금액은 " + b + " 입니다." + " 계좌잔고: " + balance);
//		
//		int a = Yoo.getBalance();
//		//Yoo.getBalance();
//		System.out.println(a);
		
		Yoo.deposit(5000);
		Yoo.withDraw(10000);
		
		int balance = Yoo.getBalance();
		System.out.println(balance);
		
		
		
		
			
		
		
		
	}

}
