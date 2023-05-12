package quiz01;

import java.util.Scanner;

/**
 * 23.04.13
 */
public class Quiz17 {
	public static void main(String[] args) {
		
		/*
		 * 1~100까지 랜덤한 수를 2번 생성합니다. (반복문 밖에서)
		 *  + 혹은 - 를 랜덤하게 생성합니다.
		 * 
		 * 스캐너를 통해서 값을 입력받습니다. (정답)
		 * 입력받은 값이 틀리면 "정답입니다"
		 * 입력받은 값이 틀리면 "틀렸습니다"
		 * 
		 * 문제를 그만 푸시려면 0을 입력하세요.
		 * 
		 * "프로그램 정상 종료" (0 눌렀을 경우)
		 * 정답 : x개
		 * 오답 : x개
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int count1 = 0;
		int count2 = 0;
		
		
		while(true) {
			int a= (int) (Math.random() * 100) + 1;
			int b= (int) (Math.random() * 100) + 1;
			int c= (int) Math.random() * 2 ;
			
//			System.out.print(a);
//	
//			System.out.print(c);
//			
//			if(c == 0) {
//				System.out.print("+");
//			} else if (c == 1)
//				System.out.print("-");
//			
//			System.out.print(b);
//			System.out.println(" = ?");	
			
			System.out.println(a + (c == 1 ? " + " : " - ") + b + " = ?");
			
			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
	
			System.out.print("> ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("================");
				System.out.println("프로그램 정상 종료");
				System.out.println("정답: " + count1);
				
				
				System.out.println("오답: " + count2);
				break;
				}
			
			if(answer == a + b || answer == a - b) {
				System.out.println("정답입니다.");
					count1 ++;
				} else if(answer != a - b || answer != a + b) {
				System.out.println("오답입니다.");
					count2 ++;
			} 
		
			System.out.println("---------------");
			
			
		}
	} 

}
