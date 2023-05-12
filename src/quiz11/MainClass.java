package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
//		Computer com = new Computer();
//	
//			com.getKb();
//			com.getMo();
//			com.getMs();
//		
		
//		KeyBoard key = new KeyBoard();
//		Mouse ms = new Mouse();
//		Monitor mo = new Monitor();
//		
//		Computer com = new Computer(key, ms, mo);
//		
//		com.computerInfo();
//		
		//get사용
		Computer com = new Computer();
		Monitor m = com.getMo();
		m.info();
			
			
	}

}
