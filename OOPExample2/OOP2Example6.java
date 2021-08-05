package OOPExample2;

// 접근 제어자 예제
class MyParent
{
	private int prv;
	int dft;
	protected int prt;
	public int pub;
	
	public void printMembers() {
		System.out.println("prv is " + prv); // 에러 발생하지 않음.
		System.out.println("dtf is " + dft);
		System.out.println("prt is : " + prt);
		System.out.println("pub is : " + pub);
	}
}
public class OOP2Example6 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println("prv is " + p.prv); // 에러.
		System.out.println("dtf is " + p.dft);
		System.out.println("prt is : " + p.dft);
		System.out.println("pub is : " + p.pub);

	}
}
