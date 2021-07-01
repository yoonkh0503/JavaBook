package OOPExample;

public class OOPExample3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80 으로 변경합니다.");
		
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}

class Card
{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	// class 변수는 객체를 생성하지 않아도 사용 가능, 클래스 변수의 생성 시기는 클래스가 메모리에 올라갔을 때.
}
