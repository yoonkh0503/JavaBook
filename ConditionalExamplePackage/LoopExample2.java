package ConditionalExamplePackage;

public class LoopExample2 {

	public static void main(String[] args) {
		/* 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는
		 * 프로그램을 작성하시오
		 */
		int dice1 = 1;
		int dice2 = 6;
		
//		System.out.println("첫번째 주사위의 숫자 : " + dice1);
//		System.out.println("두번째 주사위의 숫자 : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("첫번째 주사위의 숫자 : " + dice1);
//		System.out.println("두번째 주사위의 숫자 : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("첫번째 주사위의 숫자 : " + dice1);
//		System.out.println("두번째 주사위의 숫자 : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("첫번째 주사위의 숫자 : " + dice1);
//		System.out.println("두번째 주사위의 숫자 : " + (dice2-dice1));
//		dice1 = dice1 + 1;
//		System.out.println("첫번째 주사위의 숫자 : " + dice1);
//		System.out.println("두번째 주사위의 숫자 : " + (dice2-dice1));
		
		
		for(int i=0; i<5; i=i+1)
		{
			System.out.println("첫번째 주사위의 숫자 : " + dice1);
			System.out.println("두번째 주사위의 숫자 : " + (dice2 - dice1));
			dice1 = dice1 + 1;
		}
		
	}

}
