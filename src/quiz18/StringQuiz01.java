package quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 스캐너를 사용해서 id를 입력받습니다. 
		 * 아이디는 공백을 포함해서 받을 수 있습니다. nextLine()
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다. 
		 * 		5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
		 */
		
		Scanner scan = new Scanner(System.in);
	
		// v 내방법
//		for(int a = 0 ; a >= 0; a++) {
//			System.out.print("아이디를 입력해주세요: ");
//			String str = scan.nextLine();
//			String str1 = str.replace(" ", "");
//			if(str1.length() < 5) {
//				System.out.println("아이디는 공백을 제외하고 5글자 이상이어야 합니다. 다시입력하세요");
//			} else {
//				System.out.println("아이디가 등록되었습니다.");
//				break;
//			}
//		}
		// v 쌤 방법
		
		while(true) {
			System.out.print("id를 입력하세요> ");
			String id = scan.nextLine();
			id = id.replace(" ", "");
		
			if(id.length() >= 5) {
				System.out.println(id + "가 등록되었습니다.");
				break;
			}else {
				System.out.println(id + "는 5글자 이상입니다.");
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
