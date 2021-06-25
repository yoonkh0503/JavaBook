package ArrayExamplePackage;

import java.util.Arrays;

public class ArrayExample6 {

	public static void main(String[] args) {
		int[] numarr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numarr));
		
		for(int i=0; i<1; i=i+1)
		{
			int randomnum = (int)(Math.random() * 10); // 0~9중 한 값을 임의로 얻는다.
			int tmp = numarr[0];
			numarr[0] = numarr[randomnum];
			numarr[randomnum] = tmp;
		}
		
		System.out.println(Arrays.toString(numarr));
		
		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성
		
		// 배열의 각 요소에 1~45의 값을 저장;
		for(int i=0; i<ball.length; i=i+1)
		{
			ball[i] = i+1;
		}
		
		int tmp = 0; // 두 값을 바꾸는데 사용할 임시 변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의에 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		
		for(int i=0; i<6; i=i+1)
		{
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		
		for(int i=0; i<6; i=i+1)
		{
			System.out.printf("ball[%d] = %d\n",i,ball[i]);
		}
	}

}
