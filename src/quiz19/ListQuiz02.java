package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		while(true) {
			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램종료]");
			System.out.print("메뉴(번호)>");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				System.out.print("이름과 나이를 입력하세요>>");
				String n = scan.next();
				int a = scan.nextInt();
				
				User u = new User(n, a);
				list.add(u);
				System.out.println("정상입력 되었습니다.");
				
				break;
			case 2:
				//리스크에 담긴 모든 회원이름, 나이를 출력
				for(int i = 0; i < list.size(); i++) {
					System.out.println("이름: " + list.get(i).getName()+ " 나이: " + list.get(i).getAge());
				}
				// 쌤 방법
//				 for(User u2 : list) {
//				  System.out.println(u2.getName() + "-" + u2.getAge());
//				 }
				
				break;
			case 3:
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력
				//조건 - 찾을 이름이 없다면 "~~~는 목록에 없습니다" 출력
				System.out.print("찾을 이름을 입력하세요> ");
				String a2 = scan.next();
				
				boolean bool = true;
				for(int i = 0; i < list.size(); i++) {
					
					User uu = list.get(i);
					
					String name2 = uu.getName();
					
					if(name2.equals(a2)) {
						System.out.println("이름: " + uu.getName() + " 나이: " + uu.getAge());
						bool = false;
						break;
					}
						
				}

				if(bool) {
					System.out.println(a2 + "는 목록에 없습니다.");
				}
				
				
				
				break;
			case 4:
				//삭제할 이름을 입력받아서, 이름과 동일한 User객체를 첫번째 1개만 삭제
				System.out.print("삭제할 이름을 입력하세요> ");
				String d = scan.next();
				
				
				for(int i = 0; i < list.size(); i++) {
					User uuu = list.get(i);
					
					String name3 = uuu.getName();
					
					if(name3.equals(d)) {
						list.remove(i);
						break;
					}
					
					
				}
				
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0); // 종료
				break;

			default:
				break;
			}
			
			
			
			
		}
		
		
		
		
	}

}
