package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {
	public static void main(String[] args) {
		/*
		 * arr과  arr2는 길이가 1차이가 납니다.
		 * arr은 마라톤 참가자 입니다. 
		 * arr2는 마라톤 완주자 입니다. 
		 * 완주하지못한 사람을 리턴하는 메서드를 만드세요. 
		 */
		
		String[] arr = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] arr2 = {"홍길동", "이순신", "신사임당"};
		
	
		System.out.println(test(arr, arr2));
		
		
	}

	public static String test(String[]arr, String[]arr2) {
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int result = 0;
		for(int a = 0; a < arr.length; a++) {
			result = Arrays.binarySearch(arr2, arr[a]);
			if(result < 0) {
				//System.out.println(arr[a]);
				return arr[a];
			}
		}
		
		return "전 인원 완주 성공하였습니다";
		
	}
}
