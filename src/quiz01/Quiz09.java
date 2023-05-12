package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		
		/*
		 * 어떤 정수를 입력을 받습니다.
		 * 입력받은 정수에 해당하는 구구단을 세로로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		
		int a = scan.nextInt();
		int cal = 1;
		
		System.out.println("구구단: " + a + "단");
		
		while(cal < 10) {
		
			System.out.println(a + " X " + cal + " = " + (a * cal));
			
			cal++;
		}
			
		
		
	}
}
