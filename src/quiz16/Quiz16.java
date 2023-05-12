package quiz16;

import java.util.Scanner;

/**
 * 23.04.13
 */

public class Quiz16 {
	public static void main(String[] args) {
		
		/*
		 * updown 게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤수가 입력받은 값도다 크면 "더 큰수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도횟수 : x회를 출력하고 종료
		 * 
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a= (int) (Math.random() * 100) + 1;
		
		int count = 0 ;
		
		
		while(true) {
			try {
				System.out.print("정답입력> ");
				int i = scan.nextInt();
				count++ ;
				
				if(a == i) {
					System.out.println("정답입니다.");
					
					System.out.println("시도횟수: " + count);
					
					break;
				} else if (a > i) {
					System.out.println("더 큰 수 입니다.");
					
				} else if (a < i) {
					System.out.println("더 작은 수 입니다.");
				}
				
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				scan.nextLine(); 
				count++;
			}
			
		}
			
		
		
		
		
		
		
		
		
		
	}

}
