package quiz01;
/*
 * 230414
 */

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		/*
		 * 1. 1~9 까지 숫자 중 절대 중복되지않는 숫자 3개를 추출.
		 * 	  arr를 랜덤하게 10번 섞어줍니다. 
		 *    0~2 번째 값을 새로운 배열로 옮겨 담아보세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
//		for(int i = 1; i <= 10; i++) {			
//			int a = (int)(Math.random() * arr.length) ; //0~9
//			int b = (int)(Math.random()	* arr.length) ;
//			int temp = 0;
//			
//			temp = arr[a];
//			arr[a] = arr[b];
//			arr[b] = temp;
//		} 
//		
//		System.out.println(Arrays.toString(arr));
//		
//		int[] arr2 = new int[3];
//		
//		for(int x = 0; x < 3; x++) {
//			arr2[x] = arr[x];
//		}
//		
//		System.out.println(Arrays.toString(arr2));
		
		
		// 쌤 답변
		
		int[] arr = {1,2,3,4,5,6,7,8,9}; 
		
		for (int i = 1; i <= 10; i++) {
			
			int a = (int)(Math.random()* 9);
			int b = (int)(Math.random()* 9);
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			
		}
		
		int[] newArr = new int[3];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
		
		
		
		
	}

}
