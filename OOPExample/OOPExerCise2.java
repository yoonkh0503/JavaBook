//package OOPExample;
//
//public class OOPExerCise2 {
//
//	public static void main(String[] args) {
//		Student s = new Student("ȫ�浿",1,1,100,60,76);
//		
//		String str = s.info();
//		
//		System.out.println(str);
//
//	}
//
//}
//class Student
//{
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	float average;
//	
//	Student(String name, int ban, int no, int kor, int eng, int math)
//	{
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	
//	String info()
//	{
//		return name + " , " + ban + " , " + no + " , " + kor + " , " + eng + " , " + math
//				+ " , " + (kor + eng + math) +  " , " + Math.round(average * 10) / 10.0;
//	}
//}