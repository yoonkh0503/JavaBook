package ArrayExamplePackage;

import java.util.Arrays;

public class ArrayExample6 {

	public static void main(String[] args) {
		int[] numarr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numarr));
		
		for(int i=0; i<1; i=i+1)
		{
			int randomnum = (int)(Math.random() * 10); // 0~9�� �� ���� ���Ƿ� ��´�.
			int tmp = numarr[0];
			numarr[0] = numarr[randomnum];
			numarr[randomnum] = tmp;
		}
		
		System.out.println(Arrays.toString(numarr));
		
		int[] ball = new int[45]; // 45���� �������� �����ϱ� ���� �迭 ����
		
		// �迭�� �� ��ҿ� 1~45�� ���� ����;
		for(int i=0; i<ball.length; i=i+1)
		{
			ball[i] = i+1;
		}
		
		int tmp = 0; // �� ���� �ٲٴµ� ����� �ӽ� ����
		int j = 0; // ������ ���� �� ������ ����
		
		// �迭�� i��° ��ҿ� ���ǿ� ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		// 0��°���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		
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
