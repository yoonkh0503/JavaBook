package OOPExample2;

public class OOP2Example7 {

	public static void main(String[] args) {
		// 매개변수의 다형성
		
	}

}
//
//class Product {
//	int price;
//	int bonusPoint;
//}
//
//class Tv2 extends Product {}
//class Computer extends Product {}
//class Audio extends Product {}
//
//class Buyer {
//	int money = 1000;
//	int bonusPoint = 0;
	
	/*
	void buy(Tv2 tv2) {
		money -= tv2.price;
		bonusPoint += tv2.bonusPoint;
	}
	
	void buy(Computer computer) { // 메소드 오버로딩
		money -= computer.price;
		bonusPoint += computer.bonusPoint;
	}
	
	void buy(Audio audio) { // 메소드 오버로딩
		money -= audio.price;
		bonusPoint += audio.bonusPoint;
	}
	각 클래스 별로 메소드를 오버로딩해서 작성해야 함. 이런 번거로움을 줄이기 위해
	다음과 같이 메소드를 정의함.
	*/
//	void buy(Product product) { // Product 클래스의 모든 자손 타입을 매개 변수로 사용할 수 있음.
//		money -= product.price;
//		bonusPoint += product.bonusPoint;
//	}
//}