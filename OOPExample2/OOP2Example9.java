package OOPExample2;

public class OOP2Example9 {

	public static void main(String[] args) {
		// 여러 종류의 객체를 배열로 다루기 예제
		Buyer2 b = new Buyer2();
		b.buy(new Tv3());
		b.buy(new Computer3());
		b.buy(new Audio2());
		b.summary();
	}

}

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	
	Product2() {}
}

class Tv3 extends Product2 {
	Tv3() { super(100); }
	
	public String toString() {return "Tv";}
	
}

class Computer3 extends Product2 {
	Computer3() { super(200); }
	public String toString() {return "computer";}
}

class Audio2 extends Product2 {
	Audio2() {super(50); }
	public String toString() {return "audio";}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;  // 구입한 물품의 가격 합계
		String itemList = ""; // 구입한 물품 목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", " ;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		System.out.println("보너스 점수는 " + bonusPoint + "점 입니다.");
		
	}
}