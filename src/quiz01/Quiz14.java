package quiz01;
/**
 * 23.04.12
 */
import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		/**
		 * 1. 가로, 세로 길이를 입력을 받습니다.
		 * 2. 가로, 세로 길이만큼 사각형을 출력합니다
		 * 3. 단, 윤곽만 나오면 됩니다. 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세로> ");
		int l = scan.nextInt();
		
		System.out.print("가로> ");
		int w = scan.nextInt();

		
		for(int a = 1; a <= l; a++) {
			System.out.print("*");
			
			for(int b = 1; b <= w-1; b++) {
				//System.out.print("*");
				//가운데 뚫어주기
				if(a == l || b == w-1) {
					System.out.print("*");
				} else if(a == 1 && b < w ) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
					
			}
			
			
		
			System.out.println();
			
		}
		
		
		
		/*
		 선생님 답변
		 
		 (위의 입력값은 동일하여 제외함)
		 
		 for(int i = 1; i <= h; i++) {
		 	for(int j = 1; j <= w; j++){
		 		if(i==1 || i == h) {  //첫행, 마지막행
		 			System.out.print("*");
		 
		 		} else { // 첫행, 마지막행이 아닌경우
		 			
		 			if(j == 1 || j == w) { //첫열, 마지막열
		 				System.out.print("*");
	 				} else {
	 					System.out.print(" ");
					}
					
				}
				
			}
		
		}
		 
		 
		 
		 
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
