package OOPExample2;

public class OOP2Example3 {

	public static void main(String[] args) {
		// 오버라이딩
		Point p = new Point();
		Point3D p3D = new Point3D();
		p.x = 10;
		p.y = 20;
		
		p3D.x = 5;
		p3D.y = 10;
		p3D.z = 15;
		
		System.out.println(p.setLocation());
		System.out.println(p3D.setLocation());

	}

}

class Point {
	int x;
	int y;
	
	String setLocation() {
		return "x : " + x + " , " + "y : " + y;
	}
}

class Point3D extends Point {
	int z;
	
	String setLocation() { // 조상의 setLocation 을 오버라이딩
		return "x : " + x + " , " + "y : " + y + " , " + "z : " + z;
	}
	
	
}
