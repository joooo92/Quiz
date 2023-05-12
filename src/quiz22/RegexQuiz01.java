package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		
		/*
		 * 가격의 형식은 전부 찾아서 순서대로 출력합니다.
		 * 패턴은 1개면 됩니다. 
		 */
		
		String str = "안녕하세요? 점심은 4,500원 인데요, 커피가 무려1600원 이예요. 디저트는 무려 14000원이나 한답니다.";
		
		//String pattern = "\\d+,*";
		String pattern = "[0-9,]+원";
		
//		Pattern p =  Pattern.compile(pattern); 
//		
//		Matcher m = p.matcher(pattern);
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		// 제일 처음꺼 하나만 나옴
//		if(m.find()) { 
//			System.out.println(m.group());
//		}
		
		
		System.out.println("안녕\s안녕");
		
		

	}
}
