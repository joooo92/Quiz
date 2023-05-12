package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 중복되지않는 6자리 수(로또번호)
		 * 
		 * 1. Random 객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또번호를 저장해주세요.
		 */
		
		
		TreeSet<Integer> set = new TreeSet<>();
		
		
		while(set.size() != 6) {
			int a = (int)(Math.random()*45) + 1 ;
			set.add(a);	
		}

		System.out.println(set.toString());
		
		
//		Set<Integer> set = new HashSet<>();
//		Random ran = new Random();
//		
//		//Random객체 생성
//		Random random = new Random();
//		
//		//1부터 45까지의 랜덤 수 생성
//		int randomNimber = random.nextInt(45) +1;
//		
//		//생성된 랜덤 수 출력
//		System.out.println(randomNumber);
		
		
		
		
		
		
		
		
		
	}

}
