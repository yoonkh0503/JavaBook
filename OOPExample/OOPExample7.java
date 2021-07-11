package OOPExample;

class Data3 { int x; }

public class OOPExample7 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	// static 메서드는 객체 생성 없이 호출 가능
	static Data3 copy(Data3 d) // 참조형 반환 타입
	{
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		return tmp;
	}
}
