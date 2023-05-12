package quiz08;

public class MyCart extends Cart{

	
	// 1. 생성자는 money를 전달받고 money값 초기화, tv = 300, compu = 400, radio = 500; 초기화
	
	
	
	MyCart(int money){
		this.money = money;
		this.tv = 300;
		this.compu = 400;
		this.radio = 500;
	}
	
	
	// 2. buy() , add() , info() 메서드 오버라이드
	/*
	 * 
	 * 상품명 "tv", "compu" , "radio"
	 * 
	 * buy(상품명) 기능 
	 * 매개변수가 tv, compu, radio라면 금액에서 상품가격을 차감하고, add()메서드를 실행합니다.
	 * 단, 옳바른 상품이 아니거나, 금액이 부족할 경우애는 적절한 처리를 해주세욤
	 */
	
	
	
	void buy(String product) {
		
		switch (product) {
		case "tv":
			if(this.money < 300) {
				System.out.println("금액이 부족합니다");
				return; //함수종료
			}else {
				this.money -= 300;
			}
			break;
			
		case "compu":
			if(this.money < 400) {
				System.out.println("금액이 부족합니다");
				return; //함수종료
			}else {
				this.money -= 400;
			}
			break;
			
		case "radio":
			if(this.money < 500) {
				System.out.println("금액이 부족합니다");
				return; //함수종료
			}else {
				this.money -= 500;
			}
			break;
			
			
		default:
			System.out.println("상품을 확인해주세요");
			return;
		}
		
		add(product);
	}
	
	
	
//		switch(product) {
//			
//			case "tv" :
//				if(money < tv) {
//					System.out.println("금액이 부족합니다");
//				}else {
//					money -= tv;
//				}
//				add("tv");
//				break;
//				
//			case "compu" :
//				if(money < compu) {
//					System.out.println("금액이 부족합니다");
//				} else {
//					money -= compu;
//				}
//				add("compu");
//				break;
//				
//			case "radio" :
//				if(money < radio) {
//					System.out.println("금액이 부족합니다");
//				}else {
//					money -= radio;
//				}
//				add("radio");
//				break;
//			
//			default:
//				System.out.println("상품명을 확인하세요");
//						
//		}		

			


	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다. 
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옮겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다. 
	 */
//	void add(String cart) {
//
//		String [] cart= {};
//		if(cart.length == i) {
//			String[] cart2 =  new String[cart.length * 2];
//			for(int p = 0; p < cart2.length; p++) {
//				cart2[p] = cart[p];
//			} 
//		}		
//	}
	
	void add(String product) {
		if(i>=cart.length) { // 기존배열이 꽉 찬경우
			
			//2배인 배열
			String[] newCart = new String[cart.length * 2];
			//기본배열의 값을 복사
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			//기존배열을 변경
			cart = newCart;
			newCart = null;
		}
		cart[i] = product;
		i++;
	}
	
	
	/*
	 * info() 는
	 * cart배열에 담긴 목록만(null제외) 출력해주세요. Arrays.toString 사용하면 안된다심...
	 */
	
	void info(String product) { 
		String str = "[";
		for(int j = 0; j < i; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		
		System.out.println(str);
	}
	
	
	
	
	
	
	
}
