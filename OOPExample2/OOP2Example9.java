package OOPExample2;

public class OOP2Example9 {

	public static void main(String[] args) {
		// ���� ������ ��ü�� �迭�� �ٷ�� ����
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
	Product2[] cart = new Product2[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() { // ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;  // ������ ��ǰ�� ���� �հ�
		String itemList = ""; // ������ ��ǰ ���
		
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", " ;
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("���ʽ� ������ " + bonusPoint + "�� �Դϴ�.");
		
	}
}