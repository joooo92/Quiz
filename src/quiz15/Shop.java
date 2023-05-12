package quiz15;

import java.util.Arrays;

import quiz12.Product;

public class Shop implements IBag {
	private String [] shop = new String[100]; 
	private int index = 0;
	
//	public void insert(String item); //저장 - 매개변수를 배열에 순서대로 저장
	@Override
	public void insert(String item) {
		shop[index] = item;
		index++;	
	}

	
	
//	public void print(); //출력 - 배열안에 개수만큼 출력
	@Override
	public void print() {
//		String str = "";
//		String [] shop2 = new String[100];
		for(int a = 0; a < index; a++) {
			System.out.print(shop[a]+" ");
		} 
//		shop = shop2;
//		shop2 = null;
		
		
		
		
		
	}

	
	
//	public int search(String item); //검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
	@Override
	public int search(String item) {
		for(int a = 0; a < index; a++) { 
			if(shop[a].equals(item)) {	
				return a;
			}			
		}
		return -1;
	}

	
	
//	public boolean delete(String item); //삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)
	@Override
	public boolean delete(String item) {
		if(item == null) return false;
		
		for(int a = 0; a < index; a++) {
			if(shop[a].equals(item)){//같은 아이템 찾기
				//찾은 후 뒤의 아이템들 앞으로 땡기기
				for(int j = a; j < index - 1; j++) {
					shop[j] = shop[j+1];
				}
				shop[index-1] = null;
				index--;
				return true;
			}
		}
		
		return false;
	}

}
