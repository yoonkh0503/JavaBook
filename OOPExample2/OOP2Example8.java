package OOPExample2;

public class OOP2Example8 {

	public static void main(String[] args) {
		// 매개변수의 다형성 예제
		Buyer buyer = new Buyer();
		buyer.buy(new Tv2());
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + buyer.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + "점 입니다.");
	}

}
class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv2 extends Product {
	Tv2() { // 조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 설정.
	}
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product product) {
		if(money < product.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		money -= product.price;
		bonusPoint += product.bonusPoint;
		System.out.println(product + "을/를 구매하였습니다.");
	}
}
