package ConditionalExamplePackage;

import java.util.Scanner;

public class SwitchCaseExample1 {

	public static void main(String[] args) {
		
		// �Է��� ���� ���� �������� �����ִ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("���� ���� �Է��ϼ���.");
		month = sc.nextInt();
		
		
		while(month != 0)
		{
			switch(month)
			{
			case 3: case 4: case 5:
				System.out.println("���� ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			default:
				System.out.println("���� ������ �ܿ��Դϴ�.");
			}
		System.out.println("���� ���� �Է��ϼ���.");
		month = sc.nextInt();
		}
		System.out.println("0�� �Է��Ͽ� �����մϴ�.");
		
		
//		switch(month)
//		{
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("���� ������ ���Դϴ�.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("���� ������ �����Դϴ�.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("���� ������ �����Դϴ�.");
//			break;
//		
//		default:
//			System.out.println("���� ������ �ܿ��Դϴ�.");
//		}
		
	}

}
