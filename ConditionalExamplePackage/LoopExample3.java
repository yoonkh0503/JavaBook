package ConditionalExamplePackage;

import java.util.Scanner;

public class LoopExample3 {
	public static void main(String [] args) {
		/* 
		����ڷκ��� �ΰ��� ����(����,��)�� �Է¹޾� ���ۿ��� �������� ���� ����ϴ�
		���α׷��� �ۼ��Ͻÿ�.
		*/
		Scanner sc = new Scanner(System.in);
		
		int startnum = 0;
		int lastnum = 0;
		int result = 1;
		
		System.out.println("���� ���ڸ� �Է��ϼ���.");
		startnum = sc.nextInt();
		
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		lastnum = sc.nextInt();
			
		while(startnum <= lastnum)
		{
			result *= startnum;
			System.out.println(result);
			startnum = startnum + 1;
			
		}
		
	}

}
