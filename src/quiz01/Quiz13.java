package quiz01;

import java.util.Scanner;

public class Quiz13 { 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int t = scan.nextInt(); 

		int a = 1;
		
		while (a <= t) {
			int num1 = scan.nextInt(); 
			int num2 = scan.nextInt();
			
			System.out.println("case #" + a + ": " + (num1 + num2));
			
			a++;
		}
		
		
		
		
		
		
		
	}

}
