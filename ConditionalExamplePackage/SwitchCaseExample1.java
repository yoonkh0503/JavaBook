package ConditionalExamplePackage;

import java.util.Scanner;

public class SwitchCaseExample1 {

	public static void main(String[] args) {
		
		// 입력한 월이 무슨 계절인지 말해주는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("현재 월을 입력하세요.");
		month = sc.nextInt();
		
		
		while(month != 0)
		{
			switch(month)
			{
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재 계절은 겨울입니다.");
			}
		System.out.println("현재 월을 입력하세요.");
		month = sc.nextInt();
		}
		System.out.println("0을 입력하여 종료합니다.");
		
		
//		switch(month)
//		{
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("현재 계절은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재 계절은 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("현재 계절은 가을입니다.");
//			break;
//		
//		default:
//			System.out.println("현재 계절은 겨울입니다.");
//		}
		
	}

}
