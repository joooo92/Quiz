package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		
		/*List 1번
		 * 1. List에 1~20까지의 값을 순서대로 저장
		 * 2. List의 값을 순서대로 출력
		 */

		List<Integer>list = new ArrayList<>();
		
		for(int a = 1; a <=20; a++) {
			list.add(a);
		}
		
		for(int i = 0; i < list.size(); i++) {
		
			System.out.println(list.get(i));
		
		}
		/*List 2번
		 * 1.User를 저장하는 list생성
		 * 2.3개의 각각 다른 User객체를 만들고 순서대로 저장
		 * 3.User객체안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드
		 * 4.User객체안에 홍길자가 있으면 해당 객체를 삭제
		 */

		List<User> list2 = new ArrayList<>();
		
		
		User u1 = new User("홍길동", 10);
		User u2 = new User("이순신", 20);
		User u3 = new User("홍길자", 30);
		
	
		list2.add(u1);
		list2.add(u2);
		list2.add(u3);
		System.out.println(list2.toString());

		for(int i = 0; i < list2.size(); i++) {
			
			User u = list2.get(i);
			
			String name = u.getName();
			
			if(name.equals("홍길동")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}
		}
		
		System.out.println("=======================================");
		
		for(int i = 0; i < list.size(); i++) {
			User u = list2.get(i);
			if(u.getName().equals("홍길자")) {
				list2.remove(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
}
