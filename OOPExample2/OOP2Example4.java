package OOPExample2;

public class OOP2Example4 {

	public static void main(String[] args) {
		// 참조변수 super
		Child c = new Child();
		c.method();
		
		Child2 c2 = new Child2();
		c2.method();
	}

}
class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20; // this.x , Parent의 x를 오버라이딩 한 것임.
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x );
		System.out.println("super.x  = " + super.x);
	}
}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	void method() {
		System.out.println();
		System.out.println("Child2 method");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x );
		System.out.println("super.x  = " + super.x);
	}
}