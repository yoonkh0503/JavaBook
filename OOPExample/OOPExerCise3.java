package OOPExample;

public class OOPExerCise3 {

	public static void main(String[] args) {
		// ����,����,������ ������ ��� ���ؼ� ��ȯ�ϴ� Student Ŭ������ �޼��� ����
		// ������ ������� ���� ����� ���ϴ� Student Ŭ������ �޼��� ����
		// getAverage, getTotal �޼��带 �߰��Ͻÿ�.
		
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());

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