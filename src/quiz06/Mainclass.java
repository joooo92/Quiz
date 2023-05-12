package quiz06;

import quiz02.Account;

public class Mainclass {
	public static void main(String[] args) {

		
		MyAccount cs = new MyAccount("12345",7777,1000);
		
		
		cs.deposit(5000);
		
		
		cs.withDraw(500);
		
		System.out.println(cs.getBalance());
		
		
		
	}

}
