package quiz01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력받습니다.
		 * 2. 입력받은 정수까지 수 중에서 3의 배수이거나, 4의 배수일 경우에는 
		 *    공백으로 구분해서 가로로 출력
		 *    
		 * ex)
		 * 입력수 10
		 * 출력수 3 4 6 8 9
		 */
		// a % 3 == 0
		// a % 4 == 0
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요> ");
		int x = scan.nextInt();
		 
		
		int a = 1;
		String str = "";
		
		
		
		while(a <= x) {	
			
			if(a % 3 == 0 || a % 4 == 0) {
				//System.out.print(a + " ");
				str += a + " " ;
			} 
			
			a++;
			
		}
			
		
		
		
	}

}
