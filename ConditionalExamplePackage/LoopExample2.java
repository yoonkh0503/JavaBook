package ConditionalExamplePackage;

public class LoopExample2 {

	public static void main(String[] args) {
		/* �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�
		 */
		int dice1 = 1;
		int dice2 = 6;
		
//		System.out.println("ù��° �ֻ����� ���� : " + dice1);
//		System.out.println("�ι�° �ֻ����� ���� : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("ù��° �ֻ����� ���� : " + dice1);
//		System.out.println("�ι�° �ֻ����� ���� : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("ù��° �ֻ����� ���� : " + dice1);
//		System.out.println("�ι�° �ֻ����� ���� : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("ù��° �ֻ����� ���� : " + dice1);
//		System.out.println("�ι�° �ֻ����� ���� : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("ù��° �ֻ����� ���� : " + dice1);
//		System.out.println("�ι�° �ֻ����� ���� : " + (dice2-dice1));
		
		
		for(int i=0; i<5; i=i+1)
		{
			System.out.println("ù��° �ֻ����� ���� : " + dice1);
			System.out.println("�ι�° �ֻ����� ���� : " + (dice2 - dice1));
			dice1 = dice1 + 1;
		}
		
	}

}
