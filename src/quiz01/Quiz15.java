package quiz01;
/**
 * 23.04.13
 */
import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		
		/*
		 1. 입력받은 수 까지의 소수들의 합
		 2. 입력 7
		   -> 바깥 반복문은 7까지 회전
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력> ");
		int num = scan.nextInt();
		
		
		int sum = 0; // 소수의 합을 누적할 변수 
		int count = 0; // 약수의 갯수를 셀 변수
		
		for(int i = 1; i <= num; i++) {
			
			//count = 0; 
			
			for(int j = 1; j <= i; j++) {
				//System.out.println(i + "-" + j);
				// 각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
				// 적절한 시점 초기화...
				if (i % j == 0 ) {
				
					count ++;
					
				}
						
			} 
			
			if(count == 2) { //소수를 sum에 누적
				sum += i;
			}
			
		} 
		System.out.println("입력한 수 중에서 소수의 합:" + sum);
		
		
		
		
		
		
		
		
	}
	

}
