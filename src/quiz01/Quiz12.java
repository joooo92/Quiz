package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		// 1000까지의 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 count(갯수)
		
		int a = 1;
		int count = 0; 
		
		while(a <= 1000) {
			if(a % 4 == 0 && a % 8 != 0) {
				count++;
			}	
			a++;
		} System.out.println(count);
		
				
		

		
		// 50~100 까지의 합계 
		
		int b = 50;
		int sum = 0;
		
		
		while(b <= 100) {
			sum = sum + b;	
			b++;
		}
		System.out.println(sum);
		
		
		
		
	}
	
}
