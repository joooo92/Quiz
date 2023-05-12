package quiz01;

import java.util.Scanner;

/*
 * 23.04.14
 */
public class Quiz20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수의 갯수> ");
//		int n1 = scan.nextInt();
//		
//		int [] arr = new int[n1];
//		
//		
//		for(int a = 1; a <= n1; a++) {
//			int n2 = scan.nextInt();
//			//System.out.print("n1 개의 정수 나열> ");
//		
//			for(int b = 0; b < arr.length ;b++) {
//				int max = 0;
//				int min = 0;
//				if(max < arr[b]) {
//					max = arr[b];
//				} 
//				if (min > arr[b]){
//					min = arr[b];
//				}
//					
//				
//				System.out.println(max + " " + min);
//			}
//		
//		
//		}
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		int min = arr[0];
		int max = arr[0];
		
		i = 0;
		while(i < arr.length) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
				
				i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
