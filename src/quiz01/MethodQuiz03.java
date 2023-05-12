package quiz01;
/**
 * 230418
 */

import java.util.Arrays;

public class MethodQuiz03 {
	public static void main(String[] args) {
		
		
		char[] arr = {'a', 'b', 'c'};
		String s= method6(arr);
		System.out.println(s);
		
		int[] arr2 = {1,2,3,4,5};
		int a = method7(arr2);
		System.out.println(a);
		
		String[] arr3 = method8("안뇽", "잘가");
		System.out.println(Arrays.toString(arr3));
		
		
		
		
	}//main

	static String method6(char[] arr) {
		String str = "";
		for(int a = 0; a < arr.length; a++) {
			str += arr[a];
		}
		//System.out.print(arr);
		
		return str;
	}
	
	static int method7(int[] arr2) {
		int sum = 0;
		for(int a = 0; a < arr2.length; a++) {
			sum += arr2[a];
		}
		return sum;
	}
	
	static String[] method8(String a, String b) {
		
//		String arr [] = new String[2];
//		arr[0] = a;
//		arr[1] = b;
		
		String[] arr = {a, b};
		
		return arr;
	}
	
	
	
	
}
