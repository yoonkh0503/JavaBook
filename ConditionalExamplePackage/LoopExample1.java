package ConditionalExamplePackage;

public class LoopExample1 {

	public static void main(String[] args) {
		 /* ������ for ���� while ������ �����Ͻÿ�.
		for(int dan = 2; dan < 10; dan ++)
		{
			for(int gob = 1; gob < 10; gob++)
			{
				System.out.println(dan + " * " + gob + " = " + dan*gob);
			}
		}
		*/
		
		int dan = 2;

		int result = 0;
		
		while(dan<10)
		{
			int gob = 1; // ���⼭ �ٽ� �ʱ�ȭ�� ������ ������ ���� while������ gob�� 10�� �Ǿ� �ݺ����� ����.
			while(gob < 10)
			{
				result = dan * gob;
				System.out.println(dan + " X " + gob + " = " + result);
				gob = gob + 1;
			}
			dan = dan + 1;
		}
		

	}

}
