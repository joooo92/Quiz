package Baekjoon;

import java.util.Scanner;

public class Bj_05_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("대소문자로 이루어진 단어를 쓰세요> ");
		String s = scan.next();
		System.out.print("정수를 입력하세요. 단, s 길이보다 짧게");
		int i = scan.nextInt();
		
		char a = s.charAt(i-1);
		
		System.out.println(a);
		
		
	}

}
