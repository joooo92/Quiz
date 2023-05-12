package Baekjoon;

import java.util.Scanner;

public class Bj_02_03 {
	public static void main(String[] args) {
		
		//연도가 주어졌을때 윤년이면 1, 아니면 0 출력
		//윤년은 "연도가 4의 배수이면서" and "100의 배수가 아닐때 or 400의 배수"일때
		
		Scanner scan = new Scanner(System.in);
		
		int leapYear = scan.nextInt();
		
		if((leapYear % 4 == 0) && (leapYear % 100 != 0 || leapYear % 400 == 0)){
			System.out.println(1);
		} else
			System.out.println(0);
		
		scan.close();
			
		
		
	}

}
