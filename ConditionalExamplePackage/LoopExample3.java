package ConditionalExamplePackage;

import java.util.Scanner;

public class LoopExample3 {
	public static void main(String [] args) {
		/* 
		사용자로부터 두개의 정수(시작,끝)을 입력받아 시작에서 끝까지의 곱을 출력하는
		프로그램을 작성하시오.
		*/
		Scanner sc = new Scanner(System.in);
		
		int startnum = 0;
		int lastnum = 0;
		int result = 1;
		
		System.out.println("시작 숫자를 입력하세요.");
		startnum = sc.nextInt();
		
		System.out.println("마지막 숫자를 입력하세요.");
		lastnum = sc.nextInt();
			
		while(startnum <= lastnum)
		{
			result *= startnum;
			System.out.println(result);
			startnum = startnum + 1;
			
		}
		
	}

}
