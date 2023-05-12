package quiz01;
/**
 * 23.04.18
 */
public class MethodQuiz01 { 
	public static void main(String[] args) {
		
//		method1();
//		
//		System.out.println(method2("안뇽"));
//		
//		System.out.println(method3(2,3,5)); 
//		
//		System.out.println(method4(3));
//		
//		method5("홍홍", 3);
//		
//		System.out.println(maxNum(3,4));
//		
//		System.out.println(abs(-8));

		// ^내답변  v쌤 답변
		
		method1();
		
		String r1 = method2("안뇽");
		System.out.println(r1);
		
		double r2 = method3(1, 2, 3.14);
		System.out.println(r2);
		
		String r3 = method4(3);
		System.out.println(r3);
		
		method5("나", 3);
		
		int r4 = maxNum(1,2);
		System.out.println(r4);
		
		int r5 = abs(-75);
		System.out.println(r5);
		
		String r6 = java(6);
		System.out.println(r6);
		
		
	}//main
	
	static void method1() {
		System.out.println("안녕하세요");
	}
	
	static String method2(String str) {
		return str;
	}
	
	static double method3(int a, int b, double c) {
		
		return a + b + c;
		
	}
	
	
	static String method4(int a) {
		
		String str ="";
		if(a % 2 == 0) {
			str = "짝수입니다.";
			//System.out.println("짝수입니다");
		} else {
			str = "홀수입니다.";
			//System.out.println("홀수입니다");
		}
		return str;
		
		// 특정조건하에 return을 다르게 따로따로 적을 수 있다.
//		if(a % 2 == 0) {
//			return "짝수";
//		}else {
//			return "홀수";
//		}
		
		// return에 삼항연산자 사용 가능
//		return a % 2 == 0 ? "짝수" : "홀수";
		
	}
	
	static void method5(String str2, int a) {
//		String str = "";
//		for(int c = 1; c <= a; c++) {
//			str += str2;
//		}	
//		System.out.println(str);
//		^ 내답변    v 쌤 답변
		for(int i = 1; i <= a; i++) {
			System.out.print(str2);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		int max = 0;
		if(a > b) {
			max = a;
		//System.out.println(a);
		} else if(a < b) {
			max = b;
		//System.out.println(b);
		}
		return max;
	}
	
	static int abs(int a) {
//		int i = 0;
//		if(a < 0) {
//			i = -a;
//			//System.out.println(-a);
//		}else {
//			i = a;
//			//System.out.println(a);
//		}
//		return i;
		//^내 답변  v쌤답변
		return a > 0 ? a : -a;
	}
	
	
	static String java(int a) {
		String str = "";

		for(int b = 1; b <= a; b++) {
			if(b % 2 == 1) {
				str += "자";
			}else {
				str += "바";
			}	
			//str += b % 2 == 1 ? "자" :"바";
	}
		return str;
	
	
	
	
	
	}
	
}
