package OOPExample2;

// ���� ������ ����
class MyParent
{
	private int prv;
	int dft;
	protected int prt;
	public int pub;
	
	public void printMembers() {
		System.out.println("prv is " + prv); // ���� �߻����� ����.
		System.out.println("dtf is " + dft);
		System.out.println("prt is : " + prt);
		System.out.println("pub is : " + pub);
	}
}
public class OOP2Example6 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println("prv is " + p.prv); // ����.
		System.out.println("dtf is " + p.dft);
		System.out.println("prt is : " + p.dft);
		System.out.println("pub is : " + p.pub);

	}
}
