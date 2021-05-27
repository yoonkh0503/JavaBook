package ConditionalExamplePackage;

import java.util.Scanner;

public class LoopExample5 {

	public static void main(String[] args) {
		
		/* 사용자로부터 입력 받은 정수의 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오.
		 * 예를 들어, 53263을 입력했다면 결과는 19가 되어야 합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int inputnum = sc.nextInt();
		int cntnum = 0;
		
		while(inputnum % 10 > 0)
		{
			cntnum += inputnum % 10;
			inputnum = inputnum / 10;
		}
		System.out.println("입력한 숫자의 각 자리의 합은 " + cntnum + "입니다.");
	}

}
