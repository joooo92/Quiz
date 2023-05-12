package quiz18;

import java.util.Scanner;

public class StringQuiz02 {
	public static void main(String[] args) {
		   /* 주민번호 검증메서드 masking(String)
		    * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		    * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		    * 
		    * 조건
		    * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		    * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		    * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		    * 4. 남, 여에 대한 정보를 출력해줍니다.
		    *  
		    * masking메서드를 만들어주세요 
		    * 검증데이터 950101-1000000 -> 남자
		    * 검증데이터 9501012000000 -> 여자
		    * 검증데이터 950101-5000000 -> 예외
		    * 검증데이터 9501015000000 -> 예외
		    * 검증데이터 950101511111 -> 예외
		    */
		   
		//Scanner scan = new Scanner(System.in);
		
		
		
		try {
			masking("121224-1231234");
			masking("9501012000000");
			masking("950101-5000000");
			masking("121224-1231234");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	
	} // main
	public static void masking(String id) throws Exception {
		id = id.replace("-", "");
		
		
		if(id.length() == 13) {
			String str = id.replace(id.substring(6, 13), "-*******");
			System.out.println(str);
		} else {
			System.out.println("주민번호는 13자리로 입력해주세요");
			throw new Exception();
		}
		
		char c = id.charAt(6);
		if(c == '1' || c == '3') {
			System.out.println("남자");
		} else if(c == '2' || c == '4'){
			System.out.println("여자");
		} else {
			System.out.println("주민번호를 잘못입력하셨습니다.");
		}
		
	}
		
		
	

	
	
	
	
	
	
	
	
}
