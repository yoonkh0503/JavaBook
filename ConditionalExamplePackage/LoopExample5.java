package ConditionalExamplePackage;

import java.util.Scanner;

public class LoopExample5 {

	public static void main(String[] args) {
		
		/* ����ڷκ��� �Է� ���� ������ �� �ڸ��� ���� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���� ���, 53263�� �Է��ߴٸ� ����� 19�� �Ǿ�� �մϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int inputnum = sc.nextInt();
		int cntnum = 0;
		
		while(inputnum % 10 > 0)
		{
			cntnum += inputnum % 10;
			inputnum = inputnum / 10;
		}
		System.out.println("�Է��� ������ �� �ڸ��� ���� " + cntnum + "�Դϴ�.");
	}

}
