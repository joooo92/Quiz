package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		/*
		 *  if 구문 밖에 선언된 변수를 잘 활용합니다.
		 *  
		 *  정수 3개를 입력을 받습니다. 
		 *   
		 *  가장 큰 값, 중간 값, 작은 값을 구분해서 출력. (조건 = 같은수는 없다 라고 가정) 
		 *   
		 *   입력
		 *   15, 30, 7 -> max:30, mid:15, min:7
		 *   1, 2, 3 -> max:3, mid:2, min:1
		 *   
		 */
		
		//int max = 0;
		//int mid = 0;
		//int min = 0;
 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오 >");
		int a = scan.nextInt();
		System.out.println("두번째 수를 입력하시오 >");
		int b = scan.nextInt();
		System.out.println("세번째 수를 입력하시오 >");
		int c = scan.nextInt();
		
		if(a > b && a > c) { // a>b>c , a>c>b
			if(b > c) {
				System.out.println("max: " + a + " mid: " + b + " min: " + c);
			}else {
				System.out.println("max: " + a + " mid: " + c + " min: " + b);
			}	
		} else if(b > a && b > c) { // b>a>c , b>c>a
			if(a > c) {
				System.out.println("max: " + b + " mid: " + a + " min: " + c);
			}else {
				System.out.println("max: " + b + " mid: " + c + " min: " + a);
			}	
		} else if(c > a && c > b) { // c>a>b , c>b>a
			if(a > b) {
				System.out.println("max: " + c + " mid: " + a + " min: " + b);
			}else { 
				System.out.println("max: " + c + " mid: " + b + " min: " + a);
			}	
		}
	
		
		scan.close();
		
	}
}
