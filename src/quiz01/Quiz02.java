package quiz01;

public class Quiz02 {
 
	public static void main(String[] args) {
		
		// 1~100까지의 랜덤한 정수를 생성
		
		// 랜덤하게 나온 수가 3의 배수인지, 3의 배수가 아닌지 3항 연산식으로 결과 출력
		
		int result = (int)(Math.random() *100) + 1;
				
		//System.out.println(result);
		
		String s = result % 3 == 0 ? " 3의 배수" : " 3의 배수가 아님";
		
		System.out.println(result + "는" + s);
				
		
		//**쌤 답변**
		//int a = (int)(Math.random() * 100) + 1;
		//System.out.println(a % 3 == 0 ? "는 3의 배수" : "는 3의 배수가 아님");
		 
		
		
		
		
		
		
		
	}
}
