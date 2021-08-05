package OOPExample2;

public class OOP2Example8 {

	public static void main(String[] args) {
		// �Ű������� ������ ����
		Buyer buyer = new Buyer();
		buyer.buy(new Tv2());
		buyer.buy(new Computer());
		
		System.out.println("���� ���� ���� " + buyer.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + buyer.bonusPoint + "�� �Դϴ�.");
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
	Tv2() { // ���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100); // Tv�� ������ 100�������� ����.
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
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		money -= product.price;
		bonusPoint += product.bonusPoint;
		System.out.println(product + "��/�� �����Ͽ����ϴ�.");
	}
}
