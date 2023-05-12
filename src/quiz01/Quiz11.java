package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력받습니다. 
		 * 2. 입력받은 수까지 약수의 합
		 * 
		 * 약수 : 나누어 떨어지는 수
		 * 
		 * ex)
		 * 입력수 10
		 * 12510
		 * 출력  (약수의 합) 18
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요> ");
		int x = scan.nextInt();
		
		int a = 1; 
		int sum = 0;
		
		while(a <= x) {
			if(x % a == 0) {
				sum += a;
			}
			a++;
		
		} System.out.println(x + "의 약수의 합은 " + sum + " 입니다.");
		
				
		
	}

}
