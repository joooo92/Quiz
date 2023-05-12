package quiz01;

import java.util.Scanner;

/**
 * 21.04.14
 */
public class Quiz19 {
	public static void main(String[] args) {
		// 금액의 동전- 나머지와 몫을 잘 활용
		// 어떤 금액 x가 주어졌을 때, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액> ");
		int money = scan.nextInt();
		
		int[] arr = {1000, 500, 100, 50, 10};
		
//		System.out.println("1000원 : " + money / arr[0]);
//		
//		money = money % arr[0];		
//		System.out.println("500원 : " + money / arr[1] );
//		
//		money = money % arr[1];
//		System.out.println("100원 : " + money / arr[2] );
//		
//		money = money % arr[2];
//		System.out.println("50원 : " + money / arr[3] );
//		
//		money = money % arr[3];
//		System.out.println("10원 : " + money / arr[4] );
		

		int a = 0;
		while(a < arr.length) {
			System.out.println(arr[a] + "원: " + money/arr[a]);
			
			money = money % arr[a];
			
			a++;
		
		
		}
		
		
		
		
		
	}
	
	

}
