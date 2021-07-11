package OOPExample;

public class OOPExerCise3 {

	public static void main(String[] args) {
		// 국어,영어,수학의 점수를 모두 더해서 반환하는 Student 클래스의 메서드 구현
		// 총점을 과목수로 나눈 평균을 구하는 Student 클래스의 메서드 구현
		// getAverage, getTotal 메서드를 추가하시오.
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());

	}

}

class Student
{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
		
	int getTotal()
	{
		total = kor + eng + math;
		return total;
	}
	
	float getAverage()
	{
		float average = total / 3.0f;
		return Math.round(average * 10) / 10.0f;
	}
	
}