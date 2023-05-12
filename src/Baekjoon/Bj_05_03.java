package Baekjoon;

import java.util.Scanner;

public class Bj_05_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int t = 1; t <= 10; t++) {
			if(t <= a) {
				String str = scan.next();
				
				
				char first = str.charAt(0);
				char last = str.charAt(str.length()-1);
				
				String change1 = Character.toString(first);
				String change2 = Character.toString(last);
				
				
				System.out.println(change1 + change2);
				
				
			}
		}
		
		
		
		
		
	}

}
